package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.mylogisticfinsys.contract.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:43:02
 */
public class AnttechBlockchainFinanceMylogisticfinsysContractApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5233643511697736695L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

}
