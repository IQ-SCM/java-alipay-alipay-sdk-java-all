package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bs.invite.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 02:31:40
 */
public class AlipayCommerceOperationBsInviteConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5684194117898161268L;

	/** 
	 * 是否被邀约
	 */
	@ApiField("invitable")
	private Boolean invitable;

	public void setInvitable(Boolean invitable) {
		this.invitable = invitable;
	}
	public Boolean getInvitable( ) {
		return this.invitable;
	}

}
