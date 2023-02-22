package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlink.auth.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:56:40
 */
public class ZhimaCreditEpCreditlinkAuthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3656174356611742933L;

	/** 
	 * 业务订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 授权有效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

}
