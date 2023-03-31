package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CompanyDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.company.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 17:17:46
 */
public class AlipayBossProdCompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8387539896325969916L;

	/** 
	 * 符合查询条件的公司信息
	 */
	@ApiListField("open_api_company_query_result")
	@ApiField("company_detail")
	private List<CompanyDetail> openApiCompanyQueryResult;

	public void setOpenApiCompanyQueryResult(List<CompanyDetail> openApiCompanyQueryResult) {
		this.openApiCompanyQueryResult = openApiCompanyQueryResult;
	}
	public List<CompanyDetail> getOpenApiCompanyQueryResult( ) {
		return this.openApiCompanyQueryResult;
	}

}
