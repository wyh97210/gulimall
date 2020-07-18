package com.wyh.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallproduct.entity.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:25:04
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

