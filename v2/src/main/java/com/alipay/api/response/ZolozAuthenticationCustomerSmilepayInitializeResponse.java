package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilepay.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:45:03
 */
public class ZolozAuthenticationCustomerSmilepayInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7179263832895146122L;

	/** 
	 * 返回值
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
