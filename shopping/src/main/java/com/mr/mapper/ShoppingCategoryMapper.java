package com.mr.mapper;

import com.mr.entity.ShoppingCategory;
import com.mr.entity.ShoppingCategoryExample;
import com.mr.entity.ShoppingCategoryWithChildrenItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingCategoryMapper {
    long countByExample(ShoppingCategoryExample example);

    int deleteByExample(ShoppingCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShoppingCategory record);

    int insertSelective(ShoppingCategory record);

    List<ShoppingCategory> selectByExampleWithBLOBs(ShoppingCategoryExample example);

    List<ShoppingCategory> selectByExample(ShoppingCategoryExample example);

    ShoppingCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShoppingCategory record, @Param("example") ShoppingCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") ShoppingCategory record, @Param("example") ShoppingCategoryExample example);

    int updateByExample(@Param("record") ShoppingCategory record, @Param("example") ShoppingCategoryExample example);

    int updateByPrimaryKeySelective(ShoppingCategory record);

    int updateByPrimaryKeyWithBLOBs(ShoppingCategory record);

    int updateByPrimaryKey(ShoppingCategory record);

    List<ShoppingCategoryWithChildrenItem> listWithChildren();
}