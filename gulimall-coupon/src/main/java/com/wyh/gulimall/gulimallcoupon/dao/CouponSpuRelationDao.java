package com.wyh.gulimall.gulimallcoupon.dao;

import com.wyh.gulimall.gulimallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:18:39
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
