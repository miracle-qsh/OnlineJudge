package com.newoj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newoj.bean.Problem;
import com.newoj.bean.Student;
import com.newoj.bean.StudentExample;
import com.newoj.dao.ProblemMapper;
import com.newoj.dao.StudentMapper;

@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;
	/**
	 * ²éÑ¯ËùÓÐ
	 * @return
	 */
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentMapper.selectByExample(null);
	}
	public Student getByID(Integer id) {
		return studentMapper.selectByPrimaryKey(id);
	}
	public List<Student> getByUsername(String name){
		StudentExample studentExample = new StudentExample();
		StudentExample.Criteria criteria = studentExample.createCriteria();
		criteria.andStuUsernameEqualTo(name);
		return studentMapper.selectByExample(studentExample);
	}
	public void insert(Student stu) {
		studentMapper.insertSelective(stu);
	}
	public List<Student> getByOrder(){
		StudentExample studentExample = new StudentExample();
		StudentExample.Criteria criteria = studentExample.createCriteria();
		studentExample.setOrderByClause("stu_sloveed desc");
		return studentMapper.selectByExample(studentExample);
	}
	public void updata(Student stu) {
		studentMapper.updateByPrimaryKeySelective(stu);
	}


}
