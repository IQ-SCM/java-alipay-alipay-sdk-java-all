package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.ar.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:59:16
 */
public class MybankCreditSupplychainArSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1318618319466532317L;

	/** 
	 * 合同编号
	 */
	@ApiField("ar_no")
	private String arNo;

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

}