package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetCallbackInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.asset.interact.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:31:46
 */
public class AntMerchantExpandAssetInteractSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6855167384765869829L;

	/** 
	 * 回调结果
	 */
	@ApiListField("asset_callback_results")
	@ApiField("asset_callback_info")
	private List<AssetCallbackInfo> assetCallbackResults;

	public void setAssetCallbackResults(List<AssetCallbackInfo> assetCallbackResults) {
		this.assetCallbackResults = assetCallbackResults;
	}
	public List<AssetCallbackInfo> getAssetCallbackResults( ) {
		return this.assetCallbackResults;
	}

}
