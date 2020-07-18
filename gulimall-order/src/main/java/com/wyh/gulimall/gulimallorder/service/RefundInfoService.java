package com.wyh.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallorder.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:59:52
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

