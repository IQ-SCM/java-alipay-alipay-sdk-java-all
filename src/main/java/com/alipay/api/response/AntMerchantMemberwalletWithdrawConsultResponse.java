package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.withdraw.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:57:22
 */
public class AntMerchantMemberwalletWithdrawConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1712162935237338897L;

	/** 
	 * 实际可提现本金金额（单位：元）
	 */
	@ApiField("actual_available_withdraw_amount")
	private String actualAvailableWithdrawAmount;

	/** 
	 * 提现金额（单位：元）
	 */
	@ApiField("available_withdraw_amount")
	private String availableWithdrawAmount;

	public void setActualAvailableWithdrawAmount(String actualAvailableWithdrawAmount) {
		this.actualAvailableWithdrawAmount = actualAvailableWithdrawAmount;
	}
	public String getActualAvailableWithdrawAmount( ) {
		return this.actualAvailableWithdrawAmount;
	}

	public void setAvailableWithdrawAmount(String availableWithdrawAmount) {
		this.availableWithdrawAmount = availableWithdrawAmount;
	}
	public String getAvailableWithdrawAmount( ) {
		return this.availableWithdrawAmount;
	}

}
