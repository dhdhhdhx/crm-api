package com.crm.common.filter;

import com.alibaba.fastjson2.filter.SimplePropertyPreFilter;

/**
 * @Author: zmy
 * @Date: 2025/11/9
 * @Version: 1.0
 */
/**
 * @description: 排除JSON敏感属性
 **/
public class PropertyPreExcludeFilter extends SimplePropertyPreFilter {
    public PropertyPreExcludeFilter addExcludes(String... filters) {
        for (int i = 0; i < filters.length; i++) {
            this.getExcludes().add(filters[i]);
        }
        return this;
    }
}