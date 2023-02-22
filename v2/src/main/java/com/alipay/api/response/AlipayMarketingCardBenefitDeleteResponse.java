package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 17:55:48
 */
public class AlipayMarketingCardBenefitDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4683544615181515743L;

	/** 
	 * 权益删除结果；true成功，false失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
