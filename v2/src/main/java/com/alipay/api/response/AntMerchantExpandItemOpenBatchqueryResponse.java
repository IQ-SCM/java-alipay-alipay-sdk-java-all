package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CmItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.open.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:53:28
 */
public class AntMerchantExpandItemOpenBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4325483851693285323L;

	/** 
	 * 商品列表。
	 */
	@ApiListField("item_list")
	@ApiField("cm_item_info")
	private List<CmItemInfo> itemList;

	public void setItemList(List<CmItemInfo> itemList) {
		this.itemList = itemList;
	}
	public List<CmItemInfo> getItemList( ) {
		return this.itemList;
	}

}
