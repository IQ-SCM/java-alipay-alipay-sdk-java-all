package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VoucherItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.self.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 18:41:46
 */
public class AlipayMarketingCampaignSelfVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5874837368631995696L;

	/** 
	 * 券列表
	 */
	@ApiField("voucher_item")
	private VoucherItem voucherItem;

	public void setVoucherItem(VoucherItem voucherItem) {
		this.voucherItem = voucherItem;
	}
	public VoucherItem getVoucherItem( ) {
		return this.voucherItem;
	}

}