package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:20:16
 */
public class MybankCreditLoantradeGuarletterApplyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 3321976228568133426L;

	/** 
	 * 取消申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
