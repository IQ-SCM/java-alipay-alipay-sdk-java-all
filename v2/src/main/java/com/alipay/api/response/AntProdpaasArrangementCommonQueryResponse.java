package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArrangementVORes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.arrangement.common.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:25:13
 */
public class AntProdpaasArrangementCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7823747428163973537L;

	/** 
	 * 合约信息标准VO，一条合约一个记录
	 */
	@ApiListField("arrangements")
	@ApiField("arrangement_v_o_res")
	private List<ArrangementVORes> arrangements;

	public void setArrangements(List<ArrangementVORes> arrangements) {
		this.arrangements = arrangements;
	}
	public List<ArrangementVORes> getArrangements( ) {
		return this.arrangements;
	}

}
