package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.mcaplatform.constract.sign response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:31:37
 */
public class MybankMarketingMcaplatformConstractSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6895955137553515772L;

	/** 
	 * 签约返回结果，绿色经营签约场景
	 */
	@ApiField("sign_result")
	private Boolean signResult;

	public void setSignResult(Boolean signResult) {
		this.signResult = signResult;
	}
	public Boolean getSignResult( ) {
		return this.signResult;
	}

}
