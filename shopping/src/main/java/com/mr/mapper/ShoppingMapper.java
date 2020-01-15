package com.mr.mapper;

import com.mr.entity.ShoppingExample;
import com.mr.entity.Shopping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingMapper {
    long countByExample(ShoppingExample example);

    int deleteByExample(ShoppingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Shopping record);

    int insertSelective(Shopping record);

    List<Shopping> selectByExampleWithBLOBs(ShoppingExample example);

    List<Shopping> selectByExample(ShoppingExample example);

    Shopping selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Shopping record, @Param("example") ShoppingExample example);

    int updateByExampleWithBLOBs(@Param("record") Shopping record, @Param("example") ShoppingExample example);

    int updateByExample(@Param("record") Shopping record, @Param("example") ShoppingExample example);

    int updateByPrimaryKeySelective(Shopping record);

    int updateByPrimaryKeyWithBLOBs(Shopping record);

    int updateByPrimaryKey(Shopping record);
}