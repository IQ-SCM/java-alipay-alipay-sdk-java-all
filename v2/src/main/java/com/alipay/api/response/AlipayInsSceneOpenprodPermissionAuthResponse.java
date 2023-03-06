package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.openprod.permission.auth response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:38:14
 */
public class AlipayInsSceneOpenprodPermissionAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 4811527175449166958L;

	/** 
	 * token
	 */
	@ApiField("auth_token")
	private String authToken;

	/** 
	 * 过期时间
	 */
	@ApiField("expiration")
	private Date expiration;

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getAuthToken( ) {
		return this.authToken;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getExpiration( ) {
		return this.expiration;
	}

}