package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:42:42
 */
public class MybankCreditLoantradeGuarletterInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6683644511791457376L;

	/** 
	 * 开发票申请单单号
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
