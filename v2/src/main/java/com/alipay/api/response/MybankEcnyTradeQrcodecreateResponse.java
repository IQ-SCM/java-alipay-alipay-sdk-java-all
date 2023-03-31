package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.trade.qrcodecreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 19:36:27
 */
public class MybankEcnyTradeQrcodecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2875113432829175825L;

	/** 
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 生成的二维码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
