package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bcgroup.joined.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:16:39
 */
public class AlipaySocialBaseBcgroupJoinedConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6699475573175879229L;

	/** 
	 * 入群状态。true为已经入群，false为未入群。
	 */
	@ApiField("joined")
	private Boolean joined;

	public void setJoined(Boolean joined) {
		this.joined = joined;
	}
	public Boolean getJoined( ) {
		return this.joined;
	}

}
