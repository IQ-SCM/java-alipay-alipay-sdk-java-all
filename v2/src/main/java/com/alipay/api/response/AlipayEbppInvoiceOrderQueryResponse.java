package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceElementModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:23:33
 */
public class AlipayEbppInvoiceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5832628944514394739L;

	/** 
	 * 根据订单号发票查询要素信息
	 */
	@ApiField("invoice_element_model")
	private InvoiceElementModel invoiceElementModel;

	/** 
	 * 开票申请时传入订单号（支持主单号、子单号），不限是否为支付宝体内交易单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setInvoiceElementModel(InvoiceElementModel invoiceElementModel) {
		this.invoiceElementModel = invoiceElementModel;
	}
	public InvoiceElementModel getInvoiceElementModel( ) {
		return this.invoiceElementModel;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}