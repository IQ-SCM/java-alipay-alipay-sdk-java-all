package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.haha.testddd.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:22:38
 */
public class AlipaySecurityProdHahaTestdddQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2727919511346252827L;

	/** 
	 * 测试
	 */
	@ApiField("haha")
	private String haha;

	public void setHaha(String haha) {
		this.haha = haha;
	}
	public String getHaha( ) {
		return this.haha;
	}

}