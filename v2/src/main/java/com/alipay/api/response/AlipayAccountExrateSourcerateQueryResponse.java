package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExSourceRateVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.sourcerate.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:19:00
 */
public class AlipayAccountExrateSourcerateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3361587617553691524L;

	/** 
	 * 源汇率记录
	 */
	@ApiListField("source_rate_list")
	@ApiField("ex_source_rate_v_o")
	private List<ExSourceRateVO> sourceRateList;

	public void setSourceRateList(List<ExSourceRateVO> sourceRateList) {
		this.sourceRateList = sourceRateList;
	}
	public List<ExSourceRateVO> getSourceRateList( ) {
		return this.sourceRateList;
	}

}
