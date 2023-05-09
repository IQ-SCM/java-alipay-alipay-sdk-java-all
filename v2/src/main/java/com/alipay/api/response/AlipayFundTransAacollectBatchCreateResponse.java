package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.batch.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:17:34
 */
public class AlipayFundTransAacollectBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6344157794771944825L;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 批次随机batchToken
	 */
	@ApiField("batch_token")
	private String batchToken;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBatchToken(String batchToken) {
		this.batchToken = batchToken;
	}
	public String getBatchToken( ) {
		return this.batchToken;
	}

}
