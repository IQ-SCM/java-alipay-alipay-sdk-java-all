package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndexDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.consum.index.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:30:03
 */
public class AlipayDataDataserviceConsumIndexQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5456964985479479186L;

	/** 
	 * 指数结果详情
	 */
	@ApiListField("index_detail")
	@ApiField("index_detail")
	private List<IndexDetail> indexDetail;

	public void setIndexDetail(List<IndexDetail> indexDetail) {
		this.indexDetail = indexDetail;
	}
	public List<IndexDetail> getIndexDetail( ) {
		return this.indexDetail;
	}

}