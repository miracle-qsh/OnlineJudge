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
public class StudentController {
	
	@Autowired
	StudentService studentService;
	/**
	 * 查询题目数据（分页查询）
	 * @return
	 */

	@RequestMapping("/login")
	public String login(@RequestParam(required=false) String username,String password,HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		System.out.println(username + password);
		int id = loginCheck(username, password);
		if(username.compareTo("admin")==0&&password.compareTo("123456")==0) {
			return "toadminindex";
		}
		if(id==-1) {
			return "loginfailed";
		}
		else {
			Student stu = studentService.getByID(id);
			session.setAttribute("stu",stu);
			return "hidden";
		}
		
	}
	
	
	int loginCheck(String username, String password) {
		List<Student> list = studentService.getByUsername(username);
		for(Student student:list) {
			if(student.getStuPassword().equals(password)==true) {
				return student.getStuId();
			}
		}
		return -1;
	}
	
	int registerCheck(String username) {
		List<Student> list = studentService.getByUsername(username);
		for(Student student:list) {
			if(student.getStuUsername().equals(username)==true) {
				return 1;
			}
		}
		return -1;
	}
	
	@RequestMapping("/lindex")
	public String lindex(HttpSession session) {
		return "lindex";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("stu");
		return "lindex";
	}
	
	
	@RequestMapping("/register")
	public String register(@RequestParam(required=false) String username,String password,String nickname,String email) {
		System.out.println(username + password);
		int id = registerCheck(username);
		if(id==-1) {
			studentService.insert(new Student(null, username, password, nickname, 0, email));
			return "registersuccess";
		}
		else {
			return "registerfailed";
		}
		
	}
	
	@RequestMapping("/rank/{pnn}")
	public String rank(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model, @PathVariable("pnn")Integer pnn) {
		System.out.println("jspsuccess");
		
		PageHelper.startPage(pnn, 5);
		List<Student> pros = studentService.getByOrder();
		int rk = 1;
		for(Student stu:pros) {
			stu.setStuId(rk++);
			
		}
		PageInfo page = new PageInfo(pros,5);
		
		model.addAttribute("pageInfo", page);
		return "rank";
	}
	
}
