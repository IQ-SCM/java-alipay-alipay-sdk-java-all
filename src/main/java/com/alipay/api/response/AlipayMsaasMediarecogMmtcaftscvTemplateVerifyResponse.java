package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.template.verify response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-11 16:16:14
 */
public class AlipayMsaasMediarecogMmtcaftscvTemplateVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8711348975516625856L;

	/** 
	 * 模板识别精确度(单位 %)
	 */
	@ApiField("accuracy")
	private String accuracy;

	/** 
	 * 模板识别精确度是否通过
	 */
	@ApiField("pass")
	private Boolean pass;

	/** 
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getAccuracy( ) {
		return this.accuracy;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

}
