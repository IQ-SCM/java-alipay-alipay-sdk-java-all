package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 18:34:47
 */
public class AlipayOpenMiniInnerappCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3645695189355123945L;

	/** 
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

}