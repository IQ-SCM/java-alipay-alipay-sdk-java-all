package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作员详情
 *
 * @author auto create
 * @since 1.0, 2022-09-28 10:10:17
 */
public class AuthorityDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 4397667941252689453L;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
