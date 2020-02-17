package com.newoj.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public class JudgeController {
	
	@Autowired
	StudentService studentService;
	@Autowired
	ProblemService problemService;
	@Autowired
	SubmissionService submissionService;
	/**
	 * 查询题目数据（分页查询）
	 * @return
	 * @throws IOException 
	 * @throws InterruptedException 
	 */

	@RequestMapping("/submit")
	public String submit(@RequestParam(required=false) String lau,String code,String proid,HttpServletRequest request) throws IOException, InterruptedException {
		HttpSession session = request.getSession(true);
		Student stu = (Student) session.getAttribute("stu");
		if(stu == null) {
			return "loginfirst";
		}
		Problem pro = problemService.getByID(Integer.valueOf(proid));
		String codeexe="c:\\OnlineJudge\\Judge_Server\\Judger_Demo\\";
		String mm="";
		if(lau.compareTo("g++")==0)mm="main.cpp";
		else if(lau.compareTo("gcc")==0)mm="main.c";
		else mm="main.java";
		File codetxt = new File(codeexe+mm);
		PrintWriter pfp = new PrintWriter(codetxt);
		pfp.print(code);
		pfp.close();
		File run = new File("c:\\OnlineJudge\\Judge_Server\\Judger_Demo\\run.py");
		PrintWriter pfp1 = new PrintWriter(run);
		pfp1.print("import Compile\r\n" + 
				"import Time_Memory_Judge\r\n" + 
				"import Ans_Judge\r\n" + 
				"import Judger\r\n" + 
				"\r\n" + 
				"ans = Judger.Judge("+proid+", 1, "+pro.getProTimelim()+", "+pro.getProMemlim()+", \""+lau+"\")\r\n" + 
				"print(ans)");
		pfp1.close();
		
		String exe="cmd /c cd c:\\OnlineJudge\\Judge_Server\\Judger_Demo & python run.py";
		Process process = Runtime.getRuntime().exec(exe);
		InputStreamReader ir = new InputStreamReader(process.getInputStream());
		LineNumberReader input = new LineNumberReader(ir);
		
		
//		String pathname="c:\\OnlineJudge\\Judge_Server\\Judger_Demo\\result.txt";
//		File filename=new File(pathname);
//		InputStreamReader reader = new InputStreamReader(
//				new FileInputStream(filename));
//		BufferedReader br = new BufferedReader(reader);
		String linee="";
		linee=input.readLine();
		input.close();
		System.out.println(linee);
		int time=0, mem=0, i=0;
		
		char line[] = linee.toCharArray();
		for(i=0;i<line.length;i++)if(line[i]>='0'&&line[i]<='9')break;
		for(i=i;i<line.length;i++) {
			if(line[i]=='.'||line[i]==',')break;
			time*=10;
			time+=line[i]-'0';
		}
		for(i=i;i<line.length;i++)if(line[i]==':')break;
		for(i=i;i<line.length;i++)if(line[i]>='0'&&line[i]<='9')break;
		for(i=i;i<line.length;i++) {
			if(line[i]=='.'||line[i]==',')break;
			mem*=10;
			mem+=line[i]-'0';
		}
		for(i=i;i<line.length;i++)if(line[i]==':')break;
		System.out.println(i+3+" "+linee.length());
		String result = linee.substring(i+3, linee.length()-2);
//		String result="";
		System.out.println(time+" "+ mem+" "+result);
		int flag=1;
		System.out.println(flag+"****");
		List<Submission>li = submissionService.getAll();
		System.out.println(flag+"****");
		for(Submission p:li) {
			System.out.println(flag+"****");
			System.out.println(p.getProId() + "+" + pro.getProId() + "+" + result.compareTo("Accepted"));
			if(p.getStuId().compareTo(stu.getStuId())==0&&p.getProId().compareTo(pro.getProId())==0&&result.compareTo("Accepted")==0) {
				System.out.println("yes");
				flag=0;break;
			}
		}
		System.out.println(flag+"****");
		int tmp = code.length()*10;
		if(lau.compareTo("g++")==0)tmp+=1;
		else if(lau.compareTo("gcc")==0)tmp+=2;
		else tmp+=3;
		submissionService.insert(new Submission(null, stu.getStuId(), pro.getProId(), result, new Date(), time, mem, tmp));
		if(result.compareTo("Accepted")==0)pro.setProAcnum(pro.getProAcnum()+1);
		pro.setProTotalnum(pro.getProTotalnum()+1);
		problemService.updata(pro);
		System.out.println(flag+"______"+result.compareTo("Accepted"));
		if(flag==1&&result.compareTo("Accepted")==0) {
			stu.setStuSloveed(stu.getStuSloveed()+1);
			studentService.updata(stu);
		}
		return "tosub";
	}
	
	
	
}
