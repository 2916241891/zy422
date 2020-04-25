package com.bw.zy422.dao;

import com.bw.zy422.model.TBook;
import com.bw.zy422.model.TBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBookMapper {
    int countByExample(TBookExample example);

    int deleteByExample(TBookExample example);

    int deleteByPrimaryKey(String id);

    int insert(TBook record);

    int insertSelective(TBook record);

    List<TBook> selectByExample(TBookExample example);

    TBook selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByExample(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKey(TBook record);
}