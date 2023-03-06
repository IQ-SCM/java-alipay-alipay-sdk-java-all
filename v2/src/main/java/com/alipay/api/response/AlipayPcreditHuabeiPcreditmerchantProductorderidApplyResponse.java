package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditmerchant.productorderid.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:40:53
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderidApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8889663618424596171L;

	/** 
	 * 业务成功标志
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 订购单号
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

}