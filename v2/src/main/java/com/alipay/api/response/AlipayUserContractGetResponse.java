package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayContract;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.contract.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:00:36
 */
public class AlipayUserContractGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3189573938169173285L;

	/** 
	 * 支付宝用户订购信息
	 */
	@ApiField("alipay_contract")
	private AlipayContract alipayContract;

	public void setAlipayContract(AlipayContract alipayContract) {
		this.alipayContract = alipayContract;
	}
	public AlipayContract getAlipayContract( ) {
		return this.alipayContract;
	}

}