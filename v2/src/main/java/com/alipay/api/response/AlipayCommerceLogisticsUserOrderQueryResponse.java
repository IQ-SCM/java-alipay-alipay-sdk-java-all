package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.user.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:02:41
 */
public class AlipayCommerceLogisticsUserOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8475933273189261956L;

	/** 
	 * 格式 : json , 目前 json 的 key 有 biz_unique_no
	 */
	@ApiField("order_info")
	private String orderInfo;

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getOrderInfo( ) {
		return this.orderInfo;
	}

}
