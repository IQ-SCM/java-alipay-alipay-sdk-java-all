package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.open.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-20 14:22:38
 */
public class AlipayUserCertifyOpenInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2735947825849825913L;

	/** 
	 * 本次申请操作的唯一标识，商户需要记录，后续的操作都需要用到
	 */
	@ApiField("certify_id")
	private String certifyId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

}
