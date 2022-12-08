package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.lifeaccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:16:06
 */
public class AlipayOpenPublicLifeaccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2465922423894871472L;

	/** 
	 * 生活号id
	 */
	@ApiField("public_id")
	private String publicId;

	/** 
	 * 是否是重试请求
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId( ) {
		return this.publicId;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
