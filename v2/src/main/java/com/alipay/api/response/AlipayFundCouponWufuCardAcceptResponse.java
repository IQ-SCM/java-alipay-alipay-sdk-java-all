package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.card.accept response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:58:32
 */
public class AlipayFundCouponWufuCardAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 3314536134528736664L;

	/** 
	 * 福卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/** 
	 * 福卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardName( ) {
		return this.cardName;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

}