package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.consistency.check response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:35:10
 */
public class AlipayUserAuthenticationConsistencyCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5383653824179816742L;

	/** 
	 * 一致性校验是否通过，T/F
	 */
	@ApiField("match")
	private String match;

	public void setMatch(String match) {
		this.match = match;
	}
	public String getMatch( ) {
		return this.match;
	}

}
