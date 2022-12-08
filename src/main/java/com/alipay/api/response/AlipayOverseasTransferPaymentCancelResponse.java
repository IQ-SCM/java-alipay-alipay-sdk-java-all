package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.payment.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 10:22:24
 */
public class AlipayOverseasTransferPaymentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5562851144255578446L;

	/** 
	 * 扩展字段
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

}
