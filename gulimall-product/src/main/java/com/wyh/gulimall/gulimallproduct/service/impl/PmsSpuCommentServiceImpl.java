package com.wyh.gulimall.gulimallproduct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wyh.common.utils.PageUtils;
import com.wyh.common.utils.Query;

import com.wyh.gulimall.gulimallproduct.dao.PmsSpuCommentDao;
import com.wyh.gulimall.gulimallproduct.entity.PmsSpuCommentEntity;
import com.wyh.gulimall.gulimallproduct.service.PmsSpuCommentService;


@Service("pmsSpuCommentService")
public class PmsSpuCommentServiceImpl extends ServiceImpl<PmsSpuCommentDao, PmsSpuCommentEntity> implements PmsSpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuCommentEntity> page = this.page(
                new Query<PmsSpuCommentEntity>().getPage(params),
                new QueryWrapper<PmsSpuCommentEntity>()
        );

        return new PageUtils(page);
    }

}