package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.boxactivity.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 22:01:40
 */
public class AlipayOpenSearchBoxactivityApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2822883635394489915L;

	/** 
	 * 搜索直达活动ID
	 */
	@ApiField("box_activity_id")
	private String boxActivityId;

	public void setBoxActivityId(String boxActivityId) {
		this.boxActivityId = boxActivityId;
	}
	public String getBoxActivityId( ) {
		return this.boxActivityId;
	}

}
