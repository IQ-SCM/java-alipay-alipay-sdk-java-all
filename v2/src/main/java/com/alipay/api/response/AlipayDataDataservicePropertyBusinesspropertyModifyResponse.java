package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.property.businessproperty.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:37:02
 */
public class AlipayDataDataservicePropertyBusinesspropertyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1816345987777554674L;

	/** 
	 * 是否修改成功
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
