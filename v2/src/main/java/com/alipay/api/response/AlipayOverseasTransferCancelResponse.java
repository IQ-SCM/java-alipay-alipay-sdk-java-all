package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:18:41
 */
public class AlipayOverseasTransferCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2587696795834551258L;

	/** 
	 * 透传信息
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
