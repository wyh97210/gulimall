package com.wyh.gulimall.gulimallorder.dao;

import com.wyh.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:59:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
