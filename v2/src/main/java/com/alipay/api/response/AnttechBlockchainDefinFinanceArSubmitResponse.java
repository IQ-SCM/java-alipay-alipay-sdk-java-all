package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.ar.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:33:07
 */
public class AnttechBlockchainDefinFinanceArSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5353711287938255691L;

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
