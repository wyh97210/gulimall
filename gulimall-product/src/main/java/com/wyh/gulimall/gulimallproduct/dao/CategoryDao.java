package com.wyh.gulimall.gulimallproduct.dao;

import com.wyh.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 13:58:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
