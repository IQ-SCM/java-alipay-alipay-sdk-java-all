package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.orderwordnum.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:35:52
 */
public class AlipayOpenSearchOrderwordnumQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7776934699821766224L;

	/** 
	 * 可配置关键词数量
	 */
	@ApiField("keyword_num")
	private String keywordNum;

	public void setKeywordNum(String keywordNum) {
		this.keywordNum = keywordNum;
	}
	public String getKeywordNum( ) {
		return this.keywordNum;
	}

}
