package com.wyh.gulimall.gulimallproduct.service.impl;

import com.wyh.gulimall.gulimallproduct.service.SpuCommentService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wyh.common.utils.PageUtils;
import com.wyh.common.utils.Query;

import com.wyh.gulimall.gulimallproduct.dao.SpuCommentDao;
import com.wyh.gulimall.gulimallproduct.entity.SpuCommentEntity;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuCommentEntity> page = this.page(
                new Query<SpuCommentEntity>().getPage(params),
                new QueryWrapper<SpuCommentEntity>()
        );

        return new PageUtils(page);
    }

}