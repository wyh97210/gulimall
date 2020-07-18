package com.wyh.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallproduct.entity.PmsSpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:25:03
 */
public interface PmsSpuInfoDescService extends IService<PmsSpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

