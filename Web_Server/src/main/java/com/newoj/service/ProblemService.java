package com.newoj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newoj.bean.Problem;
import com.newoj.dao.ProblemMapper;

@Service
public class ProblemService {

	@Autowired
	ProblemMapper problemMapper;
	/**
	 * ²éÑ¯ËùÓÐ
	 * @return
	 */
	public List<Problem> getAll() {
		// TODO Auto-generated method stub
		return problemMapper.selectByExample(null);
	}
	public Problem getByID(Integer id) {
//		return problemMapper.selectByExample(new Problem(id,null,null,null,null,null,null,null,null,null
//				,null,null,null,null));
		return problemMapper.selectByPrimaryKey(id);
	}
	public void updata(Problem pro) {
		problemMapper.updateByPrimaryKeySelective(pro);
	}
	public void deleteById(int id) {
		problemMapper.deleteByPrimaryKey(id);
	}
	public void insert(Problem pro) {
		problemMapper.insertSelective(pro);
	}

}
