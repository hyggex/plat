package com.dhlk.subcontract.controller;

import com.dhlk.domain.Result;
import com.dhlk.entity.sub.CompanyPages;
import com.dhlk.subcontract.service.CompanyPagesService;
import com.dhlk.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 企业主页(CompanyPages)表控制层
 *
 * @author xkliu
 * @since 2021-03-12 09:20:59
 */
@RestController
@RequestMapping("/companyPages")
public class CompanyPagesController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyPagesService companyPagesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Result selectOne(Integer id) {
        return ResultUtils.success(this.companyPagesService.queryById(id));
    }

    /**
     * 修改企业主页
     * @param companyPages
     * @return
     */
    @PostMapping("/update")
    public Result update(@RequestBody CompanyPages companyPages) {
         companyPagesService.update(companyPages);
        return  companyPagesService.update(companyPages);
    }
}
