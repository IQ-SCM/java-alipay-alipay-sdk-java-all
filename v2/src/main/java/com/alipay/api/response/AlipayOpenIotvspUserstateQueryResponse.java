package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userstate.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-14 11:39:45
 */
public class AlipayOpenIotvspUserstateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7491594856183169353L;

	/** 
	 * 返回用户是否在库（1：在库，2：不在库）
	 */
	@ApiField("state")
	private String state;

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
