package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2022-06-10 16:34:10
 */
public class OrderVoucherAvailableScopeResult extends AlipayObject {

	private static final long serialVersionUID = 2138865197947431242L;

	/**
	 * 可用门店请求结果
	 */
	@ApiField("order_voucher_available_shop_result")
	private OrderVoucherAvailableShopResult orderVoucherAvailableShopResult;

	/**
	 * 可用范围类型。 枚举值： SHOP:可用门店 CITY_CODE:可用城市
	 */
	@ApiField("voucher_available_type")
	private String voucherAvailableType;

	public OrderVoucherAvailableShopResult getOrderVoucherAvailableShopResult() {
		return this.orderVoucherAvailableShopResult;
	}
	public void setOrderVoucherAvailableShopResult(OrderVoucherAvailableShopResult orderVoucherAvailableShopResult) {
		this.orderVoucherAvailableShopResult = orderVoucherAvailableShopResult;
	}

	public String getVoucherAvailableType() {
		return this.voucherAvailableType;
	}
	public void setVoucherAvailableType(String voucherAvailableType) {
		this.voucherAvailableType = voucherAvailableType;
	}

}
