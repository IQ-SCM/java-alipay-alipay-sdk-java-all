package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.risk.warning.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:14:11
 */
public class AnttechBlockchainFinanceRiskWarningAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5331916133246638236L;

	/** 
	 * 提交结果
	 */
	@ApiField("submit_result")
	private String submitResult;

	public void setSubmitResult(String submitResult) {
		this.submitResult = submitResult;
	}
	public String getSubmitResult( ) {
		return this.submitResult;
	}

}
