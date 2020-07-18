package com.wyh.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallproduct.entity.PmsSkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:25:03
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

