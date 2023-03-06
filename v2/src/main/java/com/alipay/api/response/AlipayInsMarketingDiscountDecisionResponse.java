package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsMktCouponCampaignDTO;
import com.alipay.api.domain.InsMktCouponDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.discount.decision response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 03:27:06
 */
public class AlipayInsMarketingDiscountDecisionResponse extends AlipayResponse {

	private static final long serialVersionUID = 5563647513125145378L;

	/** 
	 * 该订单可以享受的事后权益
	 */
	@ApiListField("mkt_coupon_campaigns")
	@ApiField("ins_mkt_coupon_campaign_d_t_o")
	private List<InsMktCouponCampaignDTO> mktCouponCampaigns;

	/** 
	 * 本次优惠咨询可以使用的权益权益列表
	 */
	@ApiListField("mkt_coupons")
	@ApiField("ins_mkt_coupon_d_t_o")
	private List<InsMktCouponDTO> mktCoupons;

	public void setMktCouponCampaigns(List<InsMktCouponCampaignDTO> mktCouponCampaigns) {
		this.mktCouponCampaigns = mktCouponCampaigns;
	}
	public List<InsMktCouponCampaignDTO> getMktCouponCampaigns( ) {
		return this.mktCouponCampaigns;
	}

	public void setMktCoupons(List<InsMktCouponDTO> mktCoupons) {
		this.mktCoupons = mktCoupons;
	}
	public List<InsMktCouponDTO> getMktCoupons( ) {
		return this.mktCoupons;
	}

}