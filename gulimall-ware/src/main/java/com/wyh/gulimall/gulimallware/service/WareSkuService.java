package com.wyh.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 17:08:24
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

