package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RechargeOrderTuitionDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.orderdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-12 10:52:11
 */
public class AlipayCommerceEducateTuitioncodeOrderdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6182359858531618329L;

	/** 
	 * 对象
	 */
	@ApiField("data")
	private RechargeOrderTuitionDTO data;

	public void setData(RechargeOrderTuitionDTO data) {
		this.data = data;
	}
	public RechargeOrderTuitionDTO getData( ) {
		return this.data;
	}

}
