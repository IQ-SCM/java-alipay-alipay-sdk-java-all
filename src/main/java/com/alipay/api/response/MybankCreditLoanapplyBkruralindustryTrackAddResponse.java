package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.bkruralindustry.track.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:16:33
 */
public class MybankCreditLoanapplyBkruralindustryTrackAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2745443787927581143L;

	/** 
	 * 是否成功
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
