package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.hmcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:47:07
 */
public class AlipayOpenMiniHmcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3265354174957438773L;

	/** 
	 * 异形码图片链接地址
	 */
	@ApiField("hm_code_url")
	private String hmCodeUrl;

	public void setHmCodeUrl(String hmCodeUrl) {
		this.hmCodeUrl = hmCodeUrl;
	}
	public String getHmCodeUrl( ) {
		return this.hmCodeUrl;
	}

}
