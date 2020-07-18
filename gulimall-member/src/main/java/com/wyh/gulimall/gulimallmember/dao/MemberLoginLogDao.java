package com.wyh.gulimall.gulimallmember.dao;

import com.wyh.gulimall.gulimallmember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:35:05
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
