package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.prize.list.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:43:01
 */
public class MybankMarketingCampaignPrizeListConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1547187667547161453L;

	/** 
	 * 可用的奖品列表
	 */
	@ApiListField("prize_list")
	@ApiField("prize_model")
	private List<PrizeModel> prizeList;

	public void setPrizeList(List<PrizeModel> prizeList) {
		this.prizeList = prizeList;
	}
	public List<PrizeModel> getPrizeList( ) {
		return this.prizeList;
	}

}