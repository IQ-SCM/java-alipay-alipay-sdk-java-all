package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.invoice.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:57:10
 */
public class AlipayBossFncGfsettleprodInvoiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2132273951889492781L;

	/** 
	 * 发票结果
	 */
	@ApiListField("result_set")
	@ApiField("invoice_response_d_t_o")
	private List<InvoiceResponseDTO> resultSet;

	public void setResultSet(List<InvoiceResponseDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<InvoiceResponseDTO> getResultSet( ) {
		return this.resultSet;
	}

}