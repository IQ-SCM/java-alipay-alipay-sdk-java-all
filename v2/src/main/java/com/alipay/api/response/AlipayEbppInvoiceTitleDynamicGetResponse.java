package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.dynamic.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:59:52
 */
public class AlipayEbppInvoiceTitleDynamicGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7227416414314638776L;

	/** 
	 * 发票抬头
	 */
	@ApiField("title")
	private InvoiceTitleModel title;

	public void setTitle(InvoiceTitleModel title) {
		this.title = title;
	}
	public InvoiceTitleModel getTitle( ) {
		return this.title;
	}

}
