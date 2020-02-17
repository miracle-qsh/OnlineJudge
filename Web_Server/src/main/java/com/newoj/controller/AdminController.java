package com.newoj.controller;

import java.nio.channels.SeekableByteChannel;
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
import com.newoj.bean.Problem;
import com.newoj.bean.Student;
import com.newoj.service.ProblemService;
import com.newoj.service.StudentService;

/**
 * 处理问题CRUD请求
 * @author acm
 *
 */
@Controller
public class AdminController {
	
	@Autowired
	StudentService studentService;
	/**
	 * 查询题目数据（分页查询）
	 * @return
	 */

	
	@RequestMapping("/adminindex")
	public String admindex() {
		return "adminindex";
	}
	@RequestMapping("/admincontest")
	public String admincontest(HttpSession session) {
		return "admincontest";
	}
	@RequestMapping("/adminstudent")
	public String adminstudent(HttpSession session) {
		return "adminstudent";
	}
	
	
}
