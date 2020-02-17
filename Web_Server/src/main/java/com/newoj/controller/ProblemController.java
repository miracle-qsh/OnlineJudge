package com.newoj.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newoj.bean.Problem;
import com.newoj.bean.Student;
import com.newoj.bean.Submission;
import com.newoj.service.ProblemService;
import com.newoj.service.StudentService;
import com.newoj.service.SubmissionService;

/**
 * 处理问题CRUD请求
 * @author acm
 *
 */
@Controller
public class ProblemController {
	
	@Autowired
	ProblemService problemService;
	@Autowired
	StudentService studentService;
	@Autowired
	SubmissionService submissionService;
	/**
	 * 查询题目数据（分页查询）
	 * @return
	 */
	@RequestMapping("/pros/{pnn}")
	public String getPros(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model, @PathVariable("pnn")Integer pnn,HttpServletRequest request) {
		System.out.println("jspsuccess");
		int mp[]=new int[5000];
		for(int i=1;i<=4000;i++)mp[i]=0;
		List<Submission>li=submissionService.getAll();
		HttpSession session = request.getSession(true);
		Student stu = (Student) session.getAttribute("stu");
		if(stu!=null) {
			for(Submission sub:li) {
				if(sub.getStuId()==stu.getStuId()&&sub.getResult().compareTo("Accepted")==0) {
					mp[sub.getProId()]=1;
				}
			}
		}
		
		PageHelper.startPage(pnn, 5);
		List<Problem> pros = problemService.getAll();
		for(Problem p:pros) {
			p.setProAcnum(p.getProAcnum()*10);
			if(mp[p.getProId()]==1)p.setProAcnum(p.getProAcnum()+1);
		}
		PageInfo page = new PageInfo(pros,5);
		
		model.addAttribute("pageInfo", page);
		return "prolist";
	}
//	public String getPros(@RequestParam(value="pn",defaultValue="1")Integer pn,
//			Model model) {
//		System.out.println("jspsuccess");
//		
//		PageHelper.startPage(pn, 5);
//		List<Problem> pros = problemService.getAll();
//		PageInfo page = new PageInfo(pros,5);
//		
//		model.addAttribute("pageInfo", page);
//		return "prolist";
//	}
	
	
	@RequestMapping("/pros/proinf/{id}")
	public ModelAndView getPros(
			@PathVariable("id")Integer id) {
		System.out.println("jspsuccess");
		Problem proinf = problemService.getByID(id);		
		ModelAndView model = new ModelAndView();
		model.addObject("proInfo",proinf);
		model.setViewName("proinfo");
		return model;
	}
	
	@RequestMapping("/adminpros/{pnn}")
	public String adminpros(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model, @PathVariable("pnn")Integer pnn,HttpServletRequest request) {
		System.out.println("jspsuccess");
		int mp[]=new int[5000];
		for(int i=1;i<=4000;i++)mp[i]=0;
		List<Submission>li=submissionService.getAll();
		HttpSession session = request.getSession(true);
		Student stu = (Student) session.getAttribute("stu");
		if(stu!=null) {
			for(Submission sub:li) {
				if(sub.getStuId()==stu.getStuId()&&sub.getResult().compareTo("Accepted")==0) {
					mp[sub.getProId()]=1;
				}
			}
		}
		
		PageHelper.startPage(pnn, 5);
		List<Problem> pros = problemService.getAll();
		for(Problem p:pros) {
			p.setProAcnum(p.getProAcnum()*10);
			if(mp[p.getProId()]==1)p.setProAcnum(p.getProAcnum()+1);
		}
		PageInfo page = new PageInfo(pros,5);
		
		model.addAttribute("pageInfo", page);
		return "adminindex";
	}
	
	@RequestMapping("/deletepro/{pnn}/{id}")
	public String deletebyid(
			@PathVariable("id")Integer id,@PathVariable("pnn")Integer pnn) {
		System.out.println("jspsuccess");
		problemService.deleteById(id);
		
		return "forward:/adminpros/"+pnn;
	}
	
	@RequestMapping("/redelete/{pnn}")
	public String submit(@RequestParam("checkpro") Integer[] checkpro, @PathVariable("pnn")Integer pnn){
		
		for(Integer it:checkpro) {
			problemService.deleteById(it.intValue());
		}
		
		return "forward:/adminpros/"+pnn;
	}
	@RequestMapping("/addproblem")
	public String addproblem() {
		return "addproblem";
	}
	
	
	@RequestMapping("/addpro")
	public String submit(@RequestParam(required=false) String title,String timelim,String memlim,
			String proinf, String input,String output, String sinput, String soutput, String hit
			,@RequestParam("datain") MultipartFile datain
			,@RequestParam("dataout") MultipartFile dataout) throws IOException{
		problemService.insert(new Problem(null, title, Integer.valueOf(timelim), Integer.valueOf(memlim), proinf, input, output, sinput, soutput, hit, 0, 0, 0, ""));
		int proid=getlastid();
		File d1 = new File("C:\\OnlineJudge\\Problem_Data\\"+proid,"data1.in");
		File d2 = new File("C:\\OnlineJudge\\Problem_Data\\"+proid,"data1.out");
		FileUtils.copyInputStreamToFile(datain.getInputStream(), d1);
		FileUtils.copyInputStreamToFile(dataout.getInputStream(), d2);
		
		return "forward:/adminpros/1";
	}
	int getlastid() {
		for(int i = 4000; i >= 1; i--) {
			if(problemService.getByID(i)!=null)return i;
		}
		return 0;
	}
	
	@RequestMapping("/touptpro/{id}")
	public String touptpro( @PathVariable("id")Integer id, Model model){
		Problem pro = problemService.getByID(id);
		model.addAttribute("proInfo", pro);
		return "updatapro";
	}
	
	@RequestMapping("/uptpro/{id}")
	public String uptpro(@RequestParam(required=false) String title,Integer timelim,Integer memlim,
			String proinf, String input,String output, String sinput, String soutput, String hit
			,@RequestParam("datain") MultipartFile datain
			,@RequestParam("dataout") MultipartFile dataout
			,@PathVariable("id")Integer id) throws IOException{
		Problem pro = problemService.getByID(id);
		pro.setProTitle(title);
		pro.setProTimelim(timelim);
		pro.setProMemlim(memlim);
		pro.setProInfo(proinf);
		pro.setProInput(input);
		pro.setProOutput(output);
		pro.setProSinput(sinput);
		pro.setProSoutput(soutput);
		pro.setProHint(hit);
		problemService.updata(pro);
		if(datain.isEmpty()==false)FileUtils.copyInputStreamToFile(datain.getInputStream(), new File("C:\\OnlineJudge\\Problem_Data\\"+pro.getProId(),"data1.in"));
		if(dataout.isEmpty()==false)FileUtils.copyInputStreamToFile(dataout.getInputStream(), new File("C:\\OnlineJudge\\Problem_Data\\"+pro.getProId(),"data1.out"));
		return "forward:/adminpros/1";
	}
	
}
