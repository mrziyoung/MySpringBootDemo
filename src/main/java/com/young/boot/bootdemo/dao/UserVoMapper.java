package com.young.boot.bootdemo.dao;

import com.young.boot.bootdemo.model.vo.UserVo;
import com.young.boot.bootdemo.model.vo.UserVoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVoMapper {
    int countByExample(UserVoExample example);

    int deleteByExample(UserVoExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserVo record);

    int insertSelective(UserVo record);

    List<UserVo> selectByExample(UserVoExample example);

    UserVo selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") UserVo record, @Param("example") UserVoExample example);

    int updateByExample(@Param("record") UserVo record, @Param("example") UserVoExample example);

    int updateByPrimaryKeySelective(UserVo record);

    int updateByPrimaryKey(UserVo record);
}