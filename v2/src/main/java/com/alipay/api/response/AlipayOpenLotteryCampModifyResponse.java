package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:52:37
 */
public class AlipayOpenLotteryCampModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7666579719258276366L;

	/** 
	 * 抽奖活动ID
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
