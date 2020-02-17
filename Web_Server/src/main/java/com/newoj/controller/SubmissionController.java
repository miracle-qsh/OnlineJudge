package com.newoj.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.newoj.bean.SubAndName;
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
public class SubmissionController {
	
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
	@RequestMapping("/subs/{pnn}")
	public String getPros(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model, @PathVariable("pnn")Integer pnn) {
		System.out.println("jspsuccess");
		
		PageHelper.startPage(pnn, 5);
		List<Submission> pros = submissionService.getAll();
		
		List<SubAndName> list = new ArrayList();
		for(Submission sub:pros) {
			Student stu = studentService.getByID(sub.getStuId());
			list.add(new SubAndName(sub, stu.getStuName()));
		}
		PageInfo page = new PageInfo(pros,5);
		model.addAttribute("pageInfo", page);
		model.addAttribute("list", list);
		return "submission";
	}

	@RequestMapping("/sublast")
	public String sublast(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model) {
		System.out.println("jspsuccess");
		List<Submission>li=submissionService.getAll();
		int num = li.size()/5;
		if(li.size()%5!=0)num++;
		PageHelper.startPage(num, 5);
		List<Submission> pros = submissionService.getAll();
		
		List<SubAndName> list = new ArrayList();
		for(Submission sub:pros) {
			Student stu = studentService.getByID(sub.getStuId());
			list.add(new SubAndName(sub, stu.getStuName()));
		}
		PageInfo page = new PageInfo(pros,5);
		model.addAttribute("pageInfo", page);
		model.addAttribute("list", list);
		return "submission";
	}

	
	
}
