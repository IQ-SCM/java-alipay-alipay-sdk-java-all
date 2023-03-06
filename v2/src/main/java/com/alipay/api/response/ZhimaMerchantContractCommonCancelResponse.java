package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.common.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:55:23
 */
public class ZhimaMerchantContractCommonCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8734565663418579961L;

	/** 
	 * 业务结果返回值
	 */
	@ApiField("biz_data")
	private String bizData;

	/** 
	 * 业务结果，成功或失败
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 错误描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData( ) {
		return this.bizData;
	}

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}