package com.crm.query;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: zmy
 * @Date: 2025/11/16
 * @Version: 1.0
 */
@Data
public class ApprovalQuery {
    @NotNull(message = "审核id不能为空")
    private Integer id;
    @NotNull(message = "审核状态不能为空")
    private Integer type;
}