package com.wyh.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallproduct.entity.PmsSkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:25:03
 */
public interface PmsSkuSaleAttrValueService extends IService<PmsSkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

