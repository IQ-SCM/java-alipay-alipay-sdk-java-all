package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满减使用限制
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:17:38
 */
public class ReduceByInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8531272666333839792L;

	/**
	 * 权益的价值
	 */
	@ApiField("amount")
	private Amount amount;

	/**
	 * 消费最低金额限制
	 */
	@ApiField("floor_amount")
	private Amount floorAmount;

	public Amount getAmount() {
		return this.amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public Amount getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(Amount floorAmount) {
		this.floorAmount = floorAmount;
	}

}
