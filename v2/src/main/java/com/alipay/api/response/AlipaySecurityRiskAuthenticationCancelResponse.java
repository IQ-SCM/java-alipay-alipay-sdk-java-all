package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.authentication.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:34:22
 */
public class AlipaySecurityRiskAuthenticationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6892149326121185495L;

	/** 
	 * 返回取消结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
