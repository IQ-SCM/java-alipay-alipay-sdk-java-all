package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TicketCodeQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.userticketcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 07:43:59
 */
public class KoubeiTradeTicketUserticketcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2718482147661686249L;

	/** 
	 * 查询结果列表
	 */
	@ApiListField("values")
	@ApiField("ticket_code_query_response")
	private List<TicketCodeQueryResponse> values;

	public void setValues(List<TicketCodeQueryResponse> values) {
		this.values = values;
	}
	public List<TicketCodeQueryResponse> getValues( ) {
		return this.values;
	}

}
