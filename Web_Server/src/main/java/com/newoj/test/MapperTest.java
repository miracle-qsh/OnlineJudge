package com.newoj.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.newoj.bean.Student;
import com.newoj.dao.StudentMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	StudentMapper studentMapper;
	
	
	@Test
	public void testSRUD() {
//		//1.创建SpringIOC容器
//		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//2.从容器中获取mapper
//		StudentMapper bean = ioc.getBean(StudentMapper.class);
		System.out.println(studentMapper);
//		studentMapper.insertSelective(new Student(null, "亓世恒", "oj123456", "2385870414@qq.com", "1001,1002"));
	}

}
