package com.newoj.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.newoj.bean.Problem;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})

public class MvcTest {
	//虚拟mvc请求，获取请求结果
	@Autowired
	WebApplicationContext context;
	MockMvc mockMvc;
	@Before
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void testPage() throws Exception {
		System.out.println("success");
		MvcResult result =  mockMvc.perform(MockMvcRequestBuilders.get("/pros").param("pn", "1")).andReturn();
		System.out.println("success");
		MockHttpServletRequest request = result.getRequest();
		System.out.println("success");
		PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
		System.out.println("页码:"+pi.getPageNum());
		List<Problem> list = pi.getList();
		for(Problem problem:list) {
			System.out.println(problem.getProTitle());
		}
	}
}
