package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.token.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:13:36
 */
public class AlipayCommerceEducateSceneTokenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1813518397648927952L;

	/** 
	 * 唤起采集组件令牌
	 */
	@ApiField("app_token")
	private String appToken;

	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}
	public String getAppToken( ) {
		return this.appToken;
	}

}
