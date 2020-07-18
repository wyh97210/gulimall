package com.wyh.gulimall.gulimallorder.dao;

import com.wyh.gulimall.gulimallorder.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:59:52
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
