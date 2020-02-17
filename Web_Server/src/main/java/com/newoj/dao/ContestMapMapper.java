package com.newoj.dao;

import com.newoj.bean.ContestMap;
import com.newoj.bean.ContestMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContestMapMapper {
    long countByExample(ContestMapExample example);

    int deleteByExample(ContestMapExample example);

    int deleteByPrimaryKey(Integer mapId);

    int insert(ContestMap record);

    int insertSelective(ContestMap record);

    List<ContestMap> selectByExample(ContestMapExample example);

    ContestMap selectByPrimaryKey(Integer mapId);

    int updateByExampleSelective(@Param("record") ContestMap record, @Param("example") ContestMapExample example);

    int updateByExample(@Param("record") ContestMap record, @Param("example") ContestMapExample example);

    int updateByPrimaryKeySelective(ContestMap record);

    int updateByPrimaryKey(ContestMap record);
}