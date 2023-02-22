package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemPrizeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.item.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:02:57
 */
public class AlipayCommerceOperationItemListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1451111629958783468L;

	/** 
	 * 奖品列表
	 */
	@ApiListField("item_list")
	@ApiField("item_prize_info")
	private List<ItemPrizeInfo> itemList;

	public void setItemList(List<ItemPrizeInfo> itemList) {
		this.itemList = itemList;
	}
	public List<ItemPrizeInfo> getItemList( ) {
		return this.itemList;
	}

}
