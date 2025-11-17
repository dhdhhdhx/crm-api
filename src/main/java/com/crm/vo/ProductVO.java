package com.crm.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: zmy
 * @Date: 2025/11/2
 * @Version: 1.0
 */
@Data
public class ProductVO {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("pId")
    private Integer pId;
    @JsonProperty("pName")
    private String pName;
    @JsonProperty("totalPrice")
    private BigDecimal totalPrice;
    private Integer count;
    private BigDecimal price;


    public Integer getId() {if (this.id == null) {return this.pId;}return this.id;}

}