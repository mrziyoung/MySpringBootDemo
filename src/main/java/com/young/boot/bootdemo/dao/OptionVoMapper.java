package com.young.boot.bootdemo.dao;

import com.young.boot.bootdemo.model.vo.OptionVo;
import com.young.boot.bootdemo.model.vo.OptionVoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptionVoMapper {
    int countByExample(OptionVoExample example);

    int deleteByExample(OptionVoExample example);

    int deleteByPrimaryKey(String name);

    int insert(OptionVo record);

    int insertSelective(OptionVo record);

    List<OptionVo> selectByExample(OptionVoExample example);

    OptionVo selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") OptionVo record, @Param("example") OptionVoExample example);

    int updateByExample(@Param("record") OptionVo record, @Param("example") OptionVoExample example);

    int updateByPrimaryKeySelective(OptionVo record);

    int updateByPrimaryKey(OptionVo record);
}