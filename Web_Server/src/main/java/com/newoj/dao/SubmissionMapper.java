package com.newoj.dao;

import com.newoj.bean.Submission;
import com.newoj.bean.SubmissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubmissionMapper {
    long countByExample(SubmissionExample example);

    int deleteByExample(SubmissionExample example);

    int deleteByPrimaryKey(Integer subId);

    int insert(Submission record);

    int insertSelective(Submission record);

    List<Submission> selectByExample(SubmissionExample example);

    Submission selectByPrimaryKey(Integer subId);

    int updateByExampleSelective(@Param("record") Submission record, @Param("example") SubmissionExample example);

    int updateByExample(@Param("record") Submission record, @Param("example") SubmissionExample example);

    int updateByPrimaryKeySelective(Submission record);

    int updateByPrimaryKey(Submission record);
}