package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.srta.nonanonymous.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-25 20:02:26
 */
public class AnttechMorseMarketingSrtaNonanonymousQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8351825283938459769L;

	/** 
	 * 蚂蚁侧返回的唯一标识
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 优惠渠道
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 最大优惠金额
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/** 
	 * 最小优惠金额
	 */
	@ApiField("min_amount")
	private String minAmount;

	/** 
	 * 是否可享受立减
	 */
	@ApiField("need_deduct")
	private Boolean needDeduct;

	/** 
	 * 奖品类型. 打折 满减 单笔减 阶梯优惠 抹零优惠 随机立减 订单金额减至 折扣方式 DISCOUNT("discount", "折扣方式"), REDUCE("reduce", "满立减"), SINGLE("single", "单笔减"), STAGED_DISCOUNT("staged_discount", "阶梯优惠"), RESET_ZERO_DISCOUNT("reset_zero_discount", "抹零优惠"), RANDOM_DISCOUNT("random", "随机立减"); REDUCE_TO_DISCOUNT("reduce_to_discount","订单金额减至 ")
	 */
	@ApiField("prize_type")
	private String prizeType;

	/** 
	 * 优惠门槛，需要满此金额才可优惠
	 */
	@ApiField("threshold")
	private String threshold;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}
	public String getMaxAmount( ) {
		return this.maxAmount;
	}

	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}
	public String getMinAmount( ) {
		return this.minAmount;
	}

	public void setNeedDeduct(Boolean needDeduct) {
		this.needDeduct = needDeduct;
	}
	public Boolean getNeedDeduct( ) {
		return this.needDeduct;
	}

	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}
	public String getPrizeType( ) {
		return this.prizeType;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
	public String getThreshold( ) {
		return this.threshold;
	}

}