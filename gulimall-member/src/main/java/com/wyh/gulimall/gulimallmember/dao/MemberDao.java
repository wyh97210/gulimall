package com.wyh.gulimall.gulimallmember.dao;

import com.wyh.gulimall.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:35:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
