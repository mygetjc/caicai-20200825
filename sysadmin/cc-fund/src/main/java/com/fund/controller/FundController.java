package com.fund.controller;

import com.cc.model.form.fund.FundInfoQuery;
import com.cc.model.po.fund.FundInfo;
import com.core.entity.BaseForm;
import com.core.entity.Result;
import com.fund.service.FundInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author 江成
 * @version 1.0.0
 * @date 2020/8/26 10:26
 */
@RestController
@RequestMapping("/fund")
@Api("fund")
@Slf4j
public class FundController {

    @Resource
    private FundInfoService fundInfoService;

    @ApiOperation(value = "新增基金", notes = "新增基金")
    @ApiImplicitParam(name = "fundForm", value = "新增用户组form表单", required = true, dataType = "GroupForm")
    @PostMapping
    public Result add(@Valid @RequestBody FundInfoQuery fundInfoQuery) {
        log.debug("name:{}", fundInfoQuery);
        FundInfo fundInfo = new FundInfo();
        BeanUtils.copyProperties(fundInfoQuery,fundInfo);
        return Result.success(fundInfoService.save(fundInfo));
    }

    @ApiOperation(value = "获取基金", notes = "获取指定基金")
    @ApiImplicitParam(paramType = "path", name = "id", value = "基金ID", required = true, dataType = "int")
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable String id) {
        log.debug("get with id:{}", id);
        return Result.success(fundInfoService.getById(id));
    }
}
