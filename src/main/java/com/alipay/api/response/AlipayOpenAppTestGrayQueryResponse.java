package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 12:26:39
 */
public class AlipayOpenAppTestGrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4514246762622265169L;

	/** 
	 * 1
	 */
	@ApiField("res")
	private String res;

	public void setRes(String res) {
		this.res = res;
	}
	public String getRes( ) {
		return this.res;
	}

}