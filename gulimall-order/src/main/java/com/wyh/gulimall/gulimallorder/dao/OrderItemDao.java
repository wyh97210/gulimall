package com.wyh.gulimall.gulimallorder.dao;

import com.wyh.gulimall.gulimallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:59:52
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
