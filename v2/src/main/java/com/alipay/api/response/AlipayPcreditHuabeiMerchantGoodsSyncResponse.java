package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.goods.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:05:34
 */
public class AlipayPcreditHuabeiMerchantGoodsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5516291725937193453L;

	/** 
	 * 业务处理成功
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
