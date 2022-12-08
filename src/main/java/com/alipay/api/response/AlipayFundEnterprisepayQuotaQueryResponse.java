package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountQuotaRespDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 17:52:12
 */
public class AlipayFundEnterprisepayQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7798446552738774352L;

	/** 
	 * 额度信息列表
	 */
	@ApiListField("quota_list")
	@ApiField("joint_account_quota_resp_d_t_o")
	private List<JointAccountQuotaRespDTO> quotaList;

	public void setQuotaList(List<JointAccountQuotaRespDTO> quotaList) {
		this.quotaList = quotaList;
	}
	public List<JointAccountQuotaRespDTO> getQuotaList( ) {
		return this.quotaList;
	}

}
