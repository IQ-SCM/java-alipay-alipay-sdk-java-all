package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:24:57
 */
public class AlipayAssetPointPointprodBudgetlibAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1662965264544839215L;

	/** 
	 * 当order_no发生幂等时返回的错误信息
	 */
	@ApiField("message")
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
