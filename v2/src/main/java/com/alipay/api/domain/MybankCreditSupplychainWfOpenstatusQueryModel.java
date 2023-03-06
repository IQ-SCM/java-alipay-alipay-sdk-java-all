package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * wf开通状态查询接口
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:44:03
 */
public class MybankCreditSupplychainWfOpenstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8814967662799738259L;

	/**
	 * 场景码，固定，WF提前收款个人
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 店铺id
	 */
	@ApiListField("sellerids")
	@ApiField("string")
	private List<String> sellerids;

	/**
	 * 站点
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点id
	 */
	@ApiField("siteuserid")
	private String siteuserid;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<String> getSellerids() {
		return this.sellerids;
	}
	public void setSellerids(List<String> sellerids) {
		this.sellerids = sellerids;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteuserid() {
		return this.siteuserid;
	}
	public void setSiteuserid(String siteuserid) {
		this.siteuserid = siteuserid;
	}

}