package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.device.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 17:52:31
 */
public class AlipayCommerceIotAdvertiserDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7763544118931611265L;

	/** 
	 * 获取商户下设备列表
	 */
	@ApiListField("device_sn_list")
	@ApiField("string")
	private List<String> deviceSnList;

	/** 
	 * 10
	 */
	@ApiField("total")
	private Long total;

	public void setDeviceSnList(List<String> deviceSnList) {
		this.deviceSnList = deviceSnList;
	}
	public List<String> getDeviceSnList( ) {
		return this.deviceSnList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
