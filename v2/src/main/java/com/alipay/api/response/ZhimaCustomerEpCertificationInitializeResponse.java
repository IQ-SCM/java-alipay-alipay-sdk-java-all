package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.ep.certification.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 19:00:35
 */
public class ZhimaCustomerEpCertificationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1732428332723873316L;

	/** 
	 * 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}