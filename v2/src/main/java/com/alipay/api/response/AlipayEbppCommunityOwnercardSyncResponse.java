package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercard.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 02:31:41
 */
public class AlipayEbppCommunityOwnercardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3599351919954676839L;

	/** 
	 * 支付宝证件id
	 */
	@ApiField("alipay_card_id")
	private String alipayCardId;

	public void setAlipayCardId(String alipayCardId) {
		this.alipayCardId = alipayCardId;
	}
	public String getAlipayCardId( ) {
		return this.alipayCardId;
	}

}
