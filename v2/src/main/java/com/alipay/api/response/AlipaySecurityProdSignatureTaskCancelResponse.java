package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:19:33
 */
public class AlipaySecurityProdSignatureTaskCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5436387391968189164L;

	/** 
	 * 是否更新成功
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
