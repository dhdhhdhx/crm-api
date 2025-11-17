package com.crm.convert;

import com.crm.entity.Customer;
import com.crm.entity.Lead;
import com.crm.vo.CustomerVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Author: zmy
 * @Date: 2025/10/19
 * @Version: 1.0
 */
@Mapper
public interface CustomerConvert {
    CustomerConvert INSTANCE = Mappers.getMapper(CustomerConvert.class);

    Customer leadConvert(Lead lead);

    Customer convert(CustomerVO customerVO);
}