package com.dhlk.subcontract.web.service;

import com.dhlk.domain.Result;
import com.dhlk.entity.basicmodule.ProjectCheck;
import com.dhlk.entity.basicmodule.ProjectDeliveryVo;
import com.dhlk.entity.basicmodule.ProjectProgressVo;
import com.dhlk.subcontract.web.service.fbk.ProjectProgressServiceFbk;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "subcontract-service/progress", fallback = ProjectProgressServiceFbk.class)
public interface ProjectProgressService {
    @GetMapping(value = "/findList")
    Result findList(@RequestParam(value = "projectId") Integer projectId);

    @PostMapping(value = "/addOne")
    public Result addOne(@RequestBody ProjectProgressVo projectProgressVo);
    @PostMapping(value = "/addDelivery")
    Result addDelivery(@RequestBody ProjectDeliveryVo projectDeliveryVo);
    @GetMapping(value = "/findAllById")
    Result findAllById(@RequestParam Integer projectId);
    @PostMapping(value = "/check")
    Result check(@RequestBody ProjectCheck projectCheck);
}