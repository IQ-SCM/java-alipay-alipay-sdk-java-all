package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.batch.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:20:04
 */
public class AlipayFundBatchTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 5292879724566523517L;

	/** 
	 * 商户请求的批次流水号，同请求中的"batch_no"。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 支付宝系统内部批次请求id。
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}
	public String getBatchTransId( ) {
		return this.batchTransId;
	}

}