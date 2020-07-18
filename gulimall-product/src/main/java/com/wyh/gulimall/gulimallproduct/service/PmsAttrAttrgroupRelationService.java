package com.wyh.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallproduct.entity.PmsAttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:25:04
 */
public interface PmsAttrAttrgroupRelationService extends IService<PmsAttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

