package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppBaseInfoQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:10:07
 */
public class AlipayOpenMiniInnerbaseinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6442883689952773736L;

	/** 
	 * 小程序基本信息
	 */
	@ApiListField("base_info_list")
	@ApiField("mini_app_base_info_query_response")
	private List<MiniAppBaseInfoQueryResponse> baseInfoList;

	public void setBaseInfoList(List<MiniAppBaseInfoQueryResponse> baseInfoList) {
		this.baseInfoList = baseInfoList;
	}
	public List<MiniAppBaseInfoQueryResponse> getBaseInfoList( ) {
		return this.baseInfoList;
	}

}
