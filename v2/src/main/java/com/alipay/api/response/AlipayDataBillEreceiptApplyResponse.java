package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.ereceipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-21 16:41:37
 */
public class AlipayDataBillEreceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7157398978974838754L;

	/** 
	 * 文件申请号file_id信息。
使用file_id可以查询处理状态，有效期：2天
	 */
	@ApiField("file_id")
	private String fileId;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

}