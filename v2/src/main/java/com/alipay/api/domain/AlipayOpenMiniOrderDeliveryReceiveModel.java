package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单确认收货
 *
 * @author auto create
 * @since 1.0, 2023-05-06 15:45:06
 */
public class AlipayOpenMiniOrderDeliveryReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1223493534198374463L;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。order_id、out_order_id，二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 用户UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
