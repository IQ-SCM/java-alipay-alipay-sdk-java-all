package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.asset.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-06 15:21:43
 */
public class MybankCreditSceneprodLoanAssetTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7134972123128649356L;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}