package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.open.certify.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:32:22
 */
public class MybankCreditUserOpenCertifyInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7252877999278843222L;

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
