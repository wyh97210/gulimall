package com.wyh.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 13:58:04
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

