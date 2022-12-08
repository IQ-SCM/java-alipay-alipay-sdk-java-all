package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.iotdelivery.stop response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:17:05
 */
public class AlipayMarketingActivityIotdeliveryStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 1152447318183583331L;

	/** 
	 * 投放计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

}
