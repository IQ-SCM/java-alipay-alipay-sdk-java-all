package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.interbank.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:44:21
 */
public class AnttechBlockchainDefinFinanceInterbankSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5637911688199874959L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private BizResult bizResult;

	public void setBizResult(BizResult bizResult) {
		this.bizResult = bizResult;
	}
	public BizResult getBizResult( ) {
		return this.bizResult;
	}

}
