package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.thirdparty.reward.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:44:56
 */
public class AlipayFundTransThirdpartyRewardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5723241226154743154L;

	/** 
	 * 打赏单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}
	public String getTransferNo( ) {
		return this.transferNo;
	}

}
