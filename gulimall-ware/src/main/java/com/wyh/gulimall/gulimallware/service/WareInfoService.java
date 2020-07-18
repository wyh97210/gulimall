package com.wyh.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyh.common.utils.PageUtils;
import com.wyh.gulimall.gulimallware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 17:08:24
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

