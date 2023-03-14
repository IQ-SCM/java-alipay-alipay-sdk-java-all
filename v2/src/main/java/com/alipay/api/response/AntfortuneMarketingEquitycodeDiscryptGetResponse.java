package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.equitycode.discrypt.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:50:05
 */
public class AntfortuneMarketingEquitycodeDiscryptGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8192823156149339666L;

	/** 
	 * 解密后的第三方券码
	 */
	@ApiField("equity_code")
	private String equityCode;

	/** 
	 * 是否推荐重试
	 */
	@ApiField("should_retry")
	private Boolean shouldRetry;

	public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}
	public String getEquityCode( ) {
		return this.equityCode;
	}

	public void setShouldRetry(Boolean shouldRetry) {
		this.shouldRetry = shouldRetry;
	}
	public Boolean getShouldRetry( ) {
		return this.shouldRetry;
	}

}
