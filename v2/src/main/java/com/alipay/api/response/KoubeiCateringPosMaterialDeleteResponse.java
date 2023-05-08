package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:07:51
 */
public class KoubeiCateringPosMaterialDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5145925184294552264L;

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
