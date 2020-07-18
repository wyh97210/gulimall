package com.wyh.gulimall.gulimallcoupon.dao;

import com.wyh.gulimall.gulimallcoupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:18:39
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
