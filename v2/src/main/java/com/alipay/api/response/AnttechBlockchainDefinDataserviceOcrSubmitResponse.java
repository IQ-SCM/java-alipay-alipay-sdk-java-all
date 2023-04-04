package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.ocr.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:54:25
 */
public class AnttechBlockchainDefinDataserviceOcrSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3334918949994769622L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private BizResult bizResult;

	public void setBizResult(BizResult bizResult) {
		this.bizResult = bizResult;
	}
	public BizResult getBizResult( ) {
		return this.bizResult;
	}

}
