package com.crm.service;

import com.crm.common.result.PageResult;
import com.crm.entity.Contract;
import com.baomidou.mybatisplus.extension.service.IService;
import com.crm.entity.ContractProduct;
import com.crm.query.ApprovalQuery;
import com.crm.query.ContractQuery;
import com.crm.query.IdQuery;
import com.crm.vo.ContractVO;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author crm
 * @since 2025-10-12
 */
public interface ContractService extends IService<Contract> {
    /**
     * 合同列表--分页
     *
     * @param query
     * @return
     */
    PageResult<ContractVO> getPage(ContractQuery query);

    /**
     * 保存或更新合同
     *
     * @param customerVO
     */
    void saveOrUpdate(ContractVO customerVO);

    /**
     * 开始审核合同
     * @param idQuery
     */
    void startApproval(IdQuery idQuery);

    /**
     * 审核合同
     * @param query
     */
    void approvalContract(ApprovalQuery query);





}
