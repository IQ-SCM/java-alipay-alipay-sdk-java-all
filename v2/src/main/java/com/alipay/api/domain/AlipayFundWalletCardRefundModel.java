package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 礼品卡退卡
 *
 * @author auto create
 * @since 1.0, 2022-11-25 13:41:56
 */
public class AlipayFundWalletCardRefundModel extends AlipayObject {

	private static final long serialVersionUID = 5173612423221129478L;

	/**
	 * 卡号列表
	 */
	@ApiListField("asset_id_lists")
	@ApiField("string")
	private List<String> assetIdLists;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 采购方账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public List<String> getAssetIdLists() {
		return this.assetIdLists;
	}
	public void setAssetIdLists(List<String> assetIdLists) {
		this.assetIdLists = assetIdLists;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
