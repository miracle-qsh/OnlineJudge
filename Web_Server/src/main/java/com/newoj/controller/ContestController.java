package com.newoj.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.nio.channels.SeekableByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newoj.bean.Contest;
import com.newoj.bean.ContestMap;
import com.newoj.bean.Problem;
import com.newoj.bean.Student;
import com.newoj.bean.Submission;
import com.newoj.dao.ContestMapMapper;
import com.newoj.service.ContestMapService;
import com.newoj.service.ContestService;
import com.newoj.service.ProblemService;
import com.newoj.service.StudentService;
import com.newoj.service.SubmissionService;

/**
 * 处理问题CRUD请求
 * @author acm
 *
 */
@Controller
public class ContestController {
	
	@Autowired
	ProblemService problemService;
	
	@Autowired
	ContestService contestService;
	
	@Autowired
	ContestMapService contestMapService;
	
	@Autowired
	SubmissionService submissionService;
	/**
	 * 查询题目数据（分页查询）
	 * @return
	 */

	@RequestMapping("/cons/{pnn}")
	public String getPros(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model, @PathVariable("pnn")Integer pnn) {
		System.out.println("jspsuccess");
		
		PageHelper.startPage(pnn, 5);
		List<Contest> cons = contestService.getAll();
		PageInfo page = new PageInfo(cons,5);
		
		model.addAttribute("pageInfo", page);
		return "contestlist";
	}
	@RequestMapping("/cons/coninf/{id}")
	public ModelAndView getcon(
			@PathVariable("id")Integer id,HttpServletRequest request) {
		
		Contest coninf = contestService.getByID(id);		
		ModelAndView model = new ModelAndView();
		model.addObject("conInfo",coninf);
		int mp[]=new int[5000];
		for(int i=1;i<=4000;i++)mp[i]=0;
		List<Submission>li=submissionService.getAll();
		System.out.println("jspsuccess222");
		HttpSession session = request.getSession(true);
		Student stu = (Student) session.getAttribute("stu");
		if(stu!=null) {
			for(Submission sub:li) {
				if(sub.getStuId()==stu.getStuId()&&sub.getResult().compareTo("Accepted")==0) {
					mp[sub.getProId()]=1;
				}
			}
		}
		
		List<ContestMap> list = contestMapService.getByConID(id);
		List<Problem> prolist = new ArrayList();
		for(ContestMap conm: list) {
			int proid = conm.getProId();
			Problem tmp = problemService.getByID(proid);
			if(tmp!=null)
			prolist.add(tmp);
		}
		
		for(Problem p:prolist) {
			
			p.setProAcnum(p.getProAcnum()*10);
			if(mp[p.getProId()]==1)p.setProAcnum(p.getProAcnum()+1);
		}
		System.out.println("jspsuccess333");
		
		model.addObject("prolist", prolist);
		
		
		model.setViewName("coninfo");
		return model;
	}
	
	
	@RequestMapping("/admincontest/{pnn}")
	public String admincon(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model, @PathVariable("pnn")Integer pnn) {
		System.out.println("jspsuccess");
		
		PageHelper.startPage(pnn, 5);
		List<Contest> cons = contestService.getAll();
		PageInfo page = new PageInfo(cons,5);
		
		model.addAttribute("pageInfo", page);
		return "admincontest";
	}
	
	@RequestMapping("/deletecon/{pnn}/{id}")
	public String deletebyid(
			@PathVariable("id")Integer id,@PathVariable("pnn")Integer pnn) {
		System.out.println("jspsuccess");
		contestService.deleteById(id);
		
		return "forward:/admincontest/"+pnn;
	}
	
	@RequestMapping("/redeletecon/{pnn}")
	public String submit(@RequestParam("checkpro") Integer[] checkpro, @PathVariable("pnn")Integer pnn){
		
		for(Integer it:checkpro) {
			contestService.deleteById(it.intValue());
		}
		
		return "forward:/admincontest/"+pnn;
	}
	
	@RequestMapping("/addcontest")
	public String toaddcontest(){
		return "addcontest";
	}
	
//	
	@RequestMapping("/addcon")
	public String addcon(@RequestParam(required=false) String title, String starttime,String endtime
			,@RequestParam("pro") Integer[] pro) throws ParseException{
		System.out.print("asdjkfh" + starttime);
		starttime = starttime+" 00:00:00";
		endtime = endtime+" 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date str = sdf.parse(starttime);
		Date end = sdf.parse(endtime);
//		System.out.println(str + " " + end);
		contestService.insert(new Contest(null, title, str, end));
		int id = getlastcontest();
		for(Integer p:pro) {
			System.out.println(p+" "+id);
			if(p!=null)contestMapService.insert(new ContestMap(null, p, Integer.valueOf(id)));
		}
		return "forward:/admincontest/1";
	}
	
	int getlastcontest() {
		for(int i = 4000; i >= 0; i--) {
			if(contestService.getByID(Integer.valueOf(i))!=null)return i;
		}
		return 0;
	}
	
	@RequestMapping("/touptcon/{id}")
	public String touptcon(
			@PathVariable("id")Integer id, Model model) {
		Contest con = contestService.getByID(id);
		model.addAttribute("con", con);
		return "uptcon";
	}
	
	@RequestMapping("/uptcon/{id}")
	public String uptcon(@RequestParam(required=false) String title, String starttime,String endtime
			,@RequestParam("pro") Integer[] pro,@PathVariable("id")Integer id) throws ParseException{
		System.out.print("asdjkfh" + starttime);
		starttime = starttime+" 00:00:00";
		endtime = endtime+" 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date str = sdf.parse(starttime);
		Date end = sdf.parse(endtime);
//		System.out.println(str + " " + end);
		Contest con = contestService.getByID(id);
		con.setConName(title);
		con.setConStarttime(str);
		con.setConEndtime(end);
		contestService.updata(con);
		List<ContestMap> list = contestMapService.getByConID(con.getConId());
		for(ContestMap p:list) {
			contestMapService.delete(p.getMapId());
		}
		
//		contestService.insert(new Contest(null, title, str, end));
		for(Integer p:pro) {
			System.out.println(p+" "+id);
			if(p!=null)contestMapService.insert(new ContestMap(null, p, Integer.valueOf(id)));
		}
		return "forward:/admincontest/1";
	}
}
