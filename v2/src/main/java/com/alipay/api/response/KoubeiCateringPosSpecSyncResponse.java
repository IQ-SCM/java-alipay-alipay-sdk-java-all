package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.spec.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:43:25
 */
public class KoubeiCateringPosSpecSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5492849649795727219L;

	/** 
	 * 返回ID
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
