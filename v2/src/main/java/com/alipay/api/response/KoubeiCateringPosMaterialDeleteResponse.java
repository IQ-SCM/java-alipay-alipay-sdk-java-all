package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:33:53
 */
public class KoubeiCateringPosMaterialDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6474561428235819871L;

	/** 
	 * 配料id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
