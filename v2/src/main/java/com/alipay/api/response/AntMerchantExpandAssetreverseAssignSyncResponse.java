package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetreverse.assign.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:57:26
 */
public class AntMerchantExpandAssetreverseAssignSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6149859344843346737L;

	/** 
	 * 取消订单或退货指令接收反馈，处理结果
	 */
	@ApiListField("delivery_results")
	@ApiField("asset_result")
	private List<AssetResult> deliveryResults;

	public void setDeliveryResults(List<AssetResult> deliveryResults) {
		this.deliveryResults = deliveryResults;
	}
	public List<AssetResult> getDeliveryResults( ) {
		return this.deliveryResults;
	}

}
