package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecomsue.outsource.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:26:40
 */
public class AlipayEbppInvoiceExpensecomsueOutsourceNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6646133647245233833L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
