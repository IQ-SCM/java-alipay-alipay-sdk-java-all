package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.operation.auth.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:24:26
 */
public class AlipayOpenSpOperationAuthAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8622654559291814849L;

	/** 
	 * 支付宝操作批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

}
