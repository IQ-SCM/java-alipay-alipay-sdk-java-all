package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.sign response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-23 15:19:51
 */
public class AlipayEbppInstserviceDeductSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7397716381322154222L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 流程ID用于校验
	 */
	@ApiField("process_id")
	private String processId;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

}
