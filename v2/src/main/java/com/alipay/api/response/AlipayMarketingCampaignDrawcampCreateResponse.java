package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 03:57:13
 */
public class AlipayMarketingCampaignDrawcampCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2184146344898593231L;

	/** 
	 * 抽奖活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

}
