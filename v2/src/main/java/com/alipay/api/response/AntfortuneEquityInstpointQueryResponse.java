package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.instpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:37:45
 */
public class AntfortuneEquityInstpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7748482592455555627L;

	/** 
	 * 当前积分值，表示用户在商户下的可用积分总值
	 */
	@ApiField("point_score")
	private Long pointScore;

	public void setPointScore(Long pointScore) {
		this.pointScore = pointScore;
	}
	public Long getPointScore( ) {
		return this.pointScore;
	}

}