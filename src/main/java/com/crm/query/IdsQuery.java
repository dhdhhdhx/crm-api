package com.crm.query;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

/**
 * @Author: calm_sunset
 * @Date: 2025/10/19
 * @Version: 1.0
 */

@Data
public class IdsQuery {
    @NotNull(message = "至少传一个id")
    private List<Integer> ids;
}
