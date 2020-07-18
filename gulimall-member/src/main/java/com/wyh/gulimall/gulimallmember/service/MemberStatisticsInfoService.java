package com.wyh.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallmember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:35:05
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

