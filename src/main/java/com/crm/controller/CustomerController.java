package com.crm.controller;

import com.crm.common.result.PageResult;
import com.crm.common.result.Result;
import com.crm.query.CustomerQuery;
import com.crm.query.IdQuery;
import com.crm.query.IdsQuery;
import com.crm.service.CustomerService;
import com.crm.vo.CustomerVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author crm
 * @since 2025-10-12
 */
@Tag(name = "客户管理")
@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping("/page")
    @Operation(summary = "客户列表-分页")
    public Result<PageResult<CustomerVO>> getPage(@RequestBody CustomerQuery query){
        return Result.ok(customerService.getPage(query));
    }

    @PostMapping("export")
    @Operation(summary = "客户列表-导出")
    public void exportCustomer(@RequestBody CustomerQuery query, HttpServletResponse response) {
        customerService.exportCustomer(query, response);
    }

    @PostMapping("/saveOrUpdate")
    @Operation(summary = "客户保存或更新")
    public Result saveOrUpdate(@RequestBody @Validated CustomerVO customerVO){
        customerService.saveOrUpdate(customerVO);
        return Result.ok();
    }

    @PostMapping("toPublic")
    @Operation(summary = " 转为公海客户")
    public Result customerToPublicPool(@RequestBody @Validated IdQuery idQuery)
    {
        customerService.customerToPublicPool(idQuery);
        return Result.ok();
    }

    @PostMapping("/remove")
    @Operation(summary = "客户删除")
    public Result remove(@RequestBody @Validated IdQuery query){
        customerService.removeCustomer(query);
        return Result.ok();
    }
    @PostMapping("/removeList")
    @Operation(summary = "客户批量删除")
    public Result removeList(@RequestBody @Validated IdsQuery query){
        customerService.removeListCustomer(query);
        return Result.ok();
    }

    @PostMapping("toPrivate")
    @Operation(summary = "领取客户")
    public Result publicPoolToPrivate(@RequestBody @Validated IdQuery idQuery)
    {
        customerService.publicPoolToPrivate(idQuery);
        return Result.ok();
    }
}
