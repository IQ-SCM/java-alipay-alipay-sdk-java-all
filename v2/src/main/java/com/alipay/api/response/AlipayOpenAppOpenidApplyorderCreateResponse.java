package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.applyorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:51:58
 */
public class AlipayOpenAppOpenidApplyorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5187863123735366263L;

	/** 
	 * 工单的唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
