package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.record.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:24:45
 */
public class ZhimaCustomerContractRecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2133964275128771613L;

	/** 
	 * 本次存证记录的唯一标识
	 */
	@ApiField("record_no")
	private String recordNo;

	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}
	public String getRecordNo( ) {
		return this.recordNo;
	}

}
