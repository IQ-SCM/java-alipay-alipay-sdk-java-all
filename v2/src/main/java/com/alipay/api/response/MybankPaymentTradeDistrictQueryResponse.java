package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.District;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.district.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:43:45
 */
public class MybankPaymentTradeDistrictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8882785551491347763L;

	/** 
	 * District列表
	 */
	@ApiListField("district_details")
	@ApiField("district")
	private List<District> districtDetails;

	public void setDistrictDetails(List<District> districtDetails) {
		this.districtDetails = districtDetails;
	}
	public List<District> getDistrictDetails( ) {
		return this.districtDetails;
	}

}
