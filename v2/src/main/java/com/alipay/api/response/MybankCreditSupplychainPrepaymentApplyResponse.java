package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.prepayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:57:27
 */
public class MybankCreditSupplychainPrepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8179413952254643988L;

	/** 
	 * 预付申请单编号。
	 */
	@ApiField("prepayment_apply_no")
	private String prepaymentApplyNo;

	public void setPrepaymentApplyNo(String prepaymentApplyNo) {
		this.prepaymentApplyNo = prepaymentApplyNo;
	}
	public String getPrepaymentApplyNo( ) {
		return this.prepaymentApplyNo;
	}

}
