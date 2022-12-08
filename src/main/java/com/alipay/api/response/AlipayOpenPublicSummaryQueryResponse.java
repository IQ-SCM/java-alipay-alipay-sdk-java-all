package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.summary.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:01:43
 */
public class AlipayOpenPublicSummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7588819622757596884L;

	/** 
	 * 生活号摘要信息列表
	 */
	@ApiListField("public_info_list")
	@ApiField("summary_info")
	private List<SummaryInfo> publicInfoList;

	public void setPublicInfoList(List<SummaryInfo> publicInfoList) {
		this.publicInfoList = publicInfoList;
	}
	public List<SummaryInfo> getPublicInfoList( ) {
		return this.publicInfoList;
	}

}
