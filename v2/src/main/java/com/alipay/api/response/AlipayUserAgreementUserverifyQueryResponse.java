package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.userverify.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:22:42
 */
public class AlipayUserAgreementUserverifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1297662311915219679L;

	/** 
	 * 用户信息是否匹配
	 */
	@ApiField("user_match")
	private Boolean userMatch;

	public void setUserMatch(Boolean userMatch) {
		this.userMatch = userMatch;
	}
	public Boolean getUserMatch( ) {
		return this.userMatch;
	}

}
