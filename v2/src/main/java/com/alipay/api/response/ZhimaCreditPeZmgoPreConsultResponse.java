package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.pre.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:46:40
 */
public class ZhimaCreditPeZmgoPreConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3289665698133422346L;

	/** 
	 * 是否准入
	 */
	@ApiField("admittance")
	private Boolean admittance;

	/** 
	 * 用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 开放ID
	 */
	@ApiField("open_id")
	private String openId;

	public void setAdmittance(Boolean admittance) {
		this.admittance = admittance;
	}
	public Boolean getAdmittance( ) {
		return this.admittance;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

}