package com.newoj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newoj.bean.ContestMap;
import com.newoj.bean.ContestMapExample;
import com.newoj.bean.Problem;
import com.newoj.bean.Student;
import com.newoj.bean.StudentExample;
import com.newoj.dao.ContestMapMapper;
import com.newoj.dao.ProblemMapper;

@Service
public class ContestMapService {

	@Autowired
	ContestMapMapper contestMapMapper;
	/**
	 * ²éÑ¯ËùÓÐ
	 * @return
	 */
	public List<ContestMap> getByConID(Integer id){
		ContestMapExample contestMapExample = new ContestMapExample();
		ContestMapExample.Criteria criteria = contestMapExample.createCriteria();
		criteria.andConIdEqualTo(id);
		return contestMapMapper.selectByExample(contestMapExample);
	}
	public void insert(ContestMap con) {
		contestMapMapper.insertSelective(con);
	}
	public void delete(int id) {
		contestMapMapper.deleteByPrimaryKey(id);
	}

}
