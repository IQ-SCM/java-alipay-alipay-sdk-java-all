package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:49:37
 */
public class AlipayOpenLotteryCampModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7877261454552276927L;

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
