package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.agreement.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:56:41
 */
public class ZhimaCreditEpSceneAgreementCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8178258748972572525L;

	/** 
	 * 信用订单号
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	public void setCreditOrderNo(String creditOrderNo) {
		this.creditOrderNo = creditOrderNo;
	}
	public String getCreditOrderNo( ) {
		return this.creditOrderNo;
	}

}
