package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.qrcode.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 08:04:44
 */
public class MybankPaymentTradeQrcodeDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6653427439939879967L;

	/** 
	 * true:失效成功 false:失效失败
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
