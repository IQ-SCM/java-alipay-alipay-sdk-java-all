package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.bill.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:26:28
 */
public class KoubeiTradeBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3884927858657774893L;

	/** 
	 * 账单下载地址
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}
