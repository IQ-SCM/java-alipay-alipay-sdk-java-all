package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PunishStatusResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservcenter.rcdisposal.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 10:16:38
 */
public class AlipayFincoreComplianceRcservcenterRcdisposalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7142469425792748671L;

	/** 
	 * 处罚结果
	 */
	@ApiField("punish_status_result")
	private PunishStatusResult punishStatusResult;

	public void setPunishStatusResult(PunishStatusResult punishStatusResult) {
		this.punishStatusResult = punishStatusResult;
	}
	public PunishStatusResult getPunishStatusResult( ) {
		return this.punishStatusResult;
	}

}
