package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIAcceptanceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.accounting.accept response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:45:30
 */
public class AlipayBossFncGfacceptanceAccountingAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 1897161965146196375L;

	/** 
	 * 业财受理结果
	 */
	@ApiField("result")
	private GFAOpenAPIAcceptanceResult result;

	public void setResult(GFAOpenAPIAcceptanceResult result) {
		this.result = result;
	}
	public GFAOpenAPIAcceptanceResult getResult( ) {
		return this.result;
	}

}
