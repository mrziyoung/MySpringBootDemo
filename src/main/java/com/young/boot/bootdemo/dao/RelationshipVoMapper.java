package com.young.boot.bootdemo.dao;

import com.young.boot.bootdemo.model.vo.RelationshipVoExample;
import com.young.boot.bootdemo.model.vo.RelationshipVoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationshipVoMapper {
    int countByExample(RelationshipVoExample example);

    int deleteByExample(RelationshipVoExample example);

    int deleteByPrimaryKey(RelationshipVoKey key);

    int insert(RelationshipVoKey record);

    int insertSelective(RelationshipVoKey record);

    List<RelationshipVoKey> selectByExample(RelationshipVoExample example);

    int updateByExampleSelective(@Param("record") RelationshipVoKey record, @Param("example") RelationshipVoExample example);

    int updateByExample(@Param("record") RelationshipVoKey record, @Param("example") RelationshipVoExample example);
}