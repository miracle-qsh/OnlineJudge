package com.newoj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newoj.bean.Problem;
import com.newoj.bean.Submission;
import com.newoj.dao.ProblemMapper;
import com.newoj.dao.SubmissionMapper;

@Service
public class SubmissionService {

	@Autowired
	SubmissionMapper submissionMapper;
	/**
	 * ²éÑ¯ËùÓÐ
	 * @return
	 */
	public List<Submission> getAll() {
		// TODO Auto-generated method stub
		return submissionMapper.selectByExample(null);
	}
	public void insert(Submission sub) {
		submissionMapper.insertSelective(sub);
	}

}
