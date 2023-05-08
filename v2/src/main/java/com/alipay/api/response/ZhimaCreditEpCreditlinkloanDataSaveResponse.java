package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlinkloan.data.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:41:48
 */
public class ZhimaCreditEpCreditlinkloanDataSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3451823491225167448L;

	/** 
	 * 商户单号，正常调用返回的数据和入参中的商户单号保持一致
	 */
	@ApiField("merchant_biz_no")
	private String merchantBizNo;

	public void setMerchantBizNo(String merchantBizNo) {
		this.merchantBizNo = merchantBizNo;
	}
	public String getMerchantBizNo( ) {
		return this.merchantBizNo;
	}

}
