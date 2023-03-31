package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.contract.apply.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-28 17:01:40
 */
public class AlipayCommerceEcContractApplyUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2392788683835511665L;

	/** 
	 * 解约链接
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
