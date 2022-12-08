package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:46:38
 */
public class AlipayBusinessRelationShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5876165673726511823L;

	/** 
	 * 基于商业关系的代运营门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}
	public String getRealShopId( ) {
		return this.realShopId;
	}

}
