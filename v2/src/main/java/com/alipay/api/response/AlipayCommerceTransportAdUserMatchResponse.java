package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.user.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:50:00
 */
public class AlipayCommerceTransportAdUserMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4457495769738312932L;

	/** 
	 * 广告投放端用户ID
	 */
	@ApiField("ad_user_id")
	private String adUserId;

	public void setAdUserId(String adUserId) {
		this.adUserId = adUserId;
	}
	public String getAdUserId( ) {
		return this.adUserId;
	}

}
