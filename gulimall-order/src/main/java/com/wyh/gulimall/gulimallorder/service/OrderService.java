package com.wyh.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:59:52
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

