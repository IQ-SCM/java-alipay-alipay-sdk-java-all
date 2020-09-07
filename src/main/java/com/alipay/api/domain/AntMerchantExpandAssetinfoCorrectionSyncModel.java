package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料信息变更反馈接口
 *
 * @author auto create
 * @since 1.0, 2020-06-11 20:00:39
 */
public class AntMerchantExpandAssetinfoCorrectionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4274549445178717957L;

	/**
	 * 物料信息更正请求
	 */
	@ApiField("asset_correction")
	private AssetInfoCorrectionItem assetCorrection;

	public AssetInfoCorrectionItem getAssetCorrection() {
		return this.assetCorrection;
	}
	public void setAssetCorrection(AssetInfoCorrectionItem assetCorrection) {
		this.assetCorrection = assetCorrection;
	}

}
