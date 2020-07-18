package com.wyh.gulimall.gulimallproduct.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wyh.gulimall.gulimallproduct.entity.PmsAttrEntity;
import com.wyh.gulimall.gulimallproduct.service.PmsAttrService;
import com.wyh.common.utils.PageUtils;
import com.wyh.common.utils.R;



/**
 * 商品属性
 *
 * @author wyh
 * @email 256898782@qq.com
 * @date 2020-07-18 16:25:04
 */
@RestController
@RequestMapping("gulimallproduct/pmsattr")
public class PmsAttrController {
    @Autowired
    private PmsAttrService pmsAttrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("gulimallproduct:pmsattr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsAttrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    //@RequiresPermissions("gulimallproduct:pmsattr:info")
    public R info(@PathVariable("attrId") Long attrId){
		PmsAttrEntity pmsAttr = pmsAttrService.getById(attrId);

        return R.ok().put("pmsAttr", pmsAttr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("gulimallproduct:pmsattr:save")
    public R save(@RequestBody PmsAttrEntity pmsAttr){
		pmsAttrService.save(pmsAttr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("gulimallproduct:pmsattr:update")
    public R update(@RequestBody PmsAttrEntity pmsAttr){
		pmsAttrService.updateById(pmsAttr);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("gulimallproduct:pmsattr:delete")
    public R delete(@RequestBody Long[] attrIds){
		pmsAttrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
