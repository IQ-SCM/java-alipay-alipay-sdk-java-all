package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.inquiry.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-23 16:03:24
 */
public class AlipayInsSceneProductInquiryApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4638934251441991896L;

	/** 
	 * 保险产品保费值，金额类型(单位为分)
	 */
	@ApiField("premium")
	private Long premium;

	public void setPremium(Long premium) {
		this.premium = premium;
	}
	public Long getPremium( ) {
		return this.premium;
	}

}
