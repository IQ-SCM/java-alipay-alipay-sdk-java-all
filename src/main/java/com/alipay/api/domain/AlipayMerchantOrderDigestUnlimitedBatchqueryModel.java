package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单消费数据列表查询
 *
 * @author auto create
 * @since 1.0, 2020-06-20 10:58:28
 */
public class AlipayMerchantOrderDigestUnlimitedBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2846861816382349749L;

	/**
	 * 买家支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 结束时间，格式为：yyyy-MM-dd hh:mm:ss 查询返回的订单支付时间在end_time之前，不包括end_time 注：为了避免数据重复，可在start_time不变的情况下利用上一次返回中的next_end_time作为下一次end_time的入参，实现分页查询
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 查询订单所属的appid，该appid必须为签约商户下的appid

注：若为空，则返回订单列表不按照appid进行筛选
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 商户的uid，即所需查询订单的partnerId
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 所需查询的订单来源

取值范围：
ALL-全部订单来源（默认值）
TINY_APP-来自小程序的订单
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 查询条数
取值范围：[1,50]

注：若start_time与end_time之间的总条数大于size，则按照订单支付时间倒序取前size条；若总条数小于size，则按照订单支付时间倒序，返回实际条数
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 查询开始时间，格式为：yyyy-MM-dd hh:mm:ss

查询返回的订单支付时间在start_time之后，不包括start_time
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
