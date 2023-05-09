package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.taxbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:37:40
 */
public class AlipayCommerceYuntaskTaxbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1233178296486952679L;

	/** 
	 * 签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
