package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.yeb.asset.trade.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-03 16:36:38
 */
public class AntfortuneYebAssetTradeUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3348576742421374732L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
