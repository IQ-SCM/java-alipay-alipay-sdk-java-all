package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:53:47
 */
public class AlipayCommerceTransportVehicleownerCampaignModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1481215567838187694L;

	/** 
	 * 状态
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
