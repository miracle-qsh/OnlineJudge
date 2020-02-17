package com.newoj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newoj.bean.Contest;
import com.newoj.bean.Problem;
import com.newoj.dao.ContestMapper;
import com.newoj.dao.ProblemMapper;

@Service
public class ContestService {

	@Autowired
	ContestMapper contestMapper;
	/**
	 * ²éÑ¯ËùÓÐ
	 * @return
	 */
	public List<Contest> getAll() {
		// TODO Auto-generated method stub
		return contestMapper.selectByExample(null);
	}
	public Contest getByID(Integer id) {
//		return problemMapper.selectByExample(new Problem(id,null,null,null,null,null,null,null,null,null
//				,null,null,null,null));
		return contestMapper.selectByPrimaryKey(id);
	}
	public void deleteById(Integer id) {
		contestMapper.deleteByPrimaryKey(id);
	}
	public void insert(Contest con) {
		contestMapper.insertSelective(con);
	}
	public void updata(Contest con) {
		contestMapper.updateByPrimaryKey(con);
	}

}
