package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MpcpromoGoodsList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-14 21:11:42
 */
public class TechriskInnovateMpcpromoDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4254485137864655851L;

	/** 
	 * 商品数据列表
	 */
	@ApiField("data_list")
	private MpcpromoGoodsList dataList;

	/** 
	 * 请求链路标识，用于排查问题
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setDataList(MpcpromoGoodsList dataList) {
		this.dataList = dataList;
	}
	public MpcpromoGoodsList getDataList( ) {
		return this.dataList;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
