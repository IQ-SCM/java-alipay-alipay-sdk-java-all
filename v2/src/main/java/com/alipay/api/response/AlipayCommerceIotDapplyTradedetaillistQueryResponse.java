package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceTradeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.tradedetaillist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:04:46
 */
public class AlipayCommerceIotDapplyTradedetaillistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7691327491587528527L;

	/** 
	 * 交易明细
	 */
	@ApiListField("devicetradedetaillist")
	@ApiField("device_trade_detail")
	private List<DeviceTradeDetail> devicetradedetaillist;

	/** 
	 * 表示记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDevicetradedetaillist(List<DeviceTradeDetail> devicetradedetaillist) {
		this.devicetradedetaillist = devicetradedetaillist;
	}
	public List<DeviceTradeDetail> getDevicetradedetaillist( ) {
		return this.devicetradedetaillist;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
