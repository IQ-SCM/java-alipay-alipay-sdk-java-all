package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlinkloan.authorder.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:26:52
 */
public class ZhimaCreditEpCreditlinkloanAuthorderSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1755989477612526423L;

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
