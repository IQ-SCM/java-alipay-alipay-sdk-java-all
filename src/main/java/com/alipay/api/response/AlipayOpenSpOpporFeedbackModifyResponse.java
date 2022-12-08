package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.oppor.feedback.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 19:25:38
 */
public class AlipayOpenSpOpporFeedbackModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3487462916989777575L;

	/** 
	 * 商机拓展结果反馈结果失败描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 商机拓展结果反馈结果是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
