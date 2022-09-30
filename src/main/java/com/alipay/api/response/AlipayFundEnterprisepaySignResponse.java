package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.sign response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-22 11:31:47
 */
public class AlipayFundEnterprisepaySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7127751545473352969L;

	/** 
	 * 签约凭证
	 */
	@ApiField("sign_token")
	private String signToken;

	/** 
	 * 签约链接，用于跳转到开户页面
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignToken(String signToken) {
		this.signToken = signToken;
	}
	public String getSignToken( ) {
		return this.signToken;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
