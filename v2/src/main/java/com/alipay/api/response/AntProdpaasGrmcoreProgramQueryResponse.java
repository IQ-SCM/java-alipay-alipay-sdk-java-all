package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GrmProjectInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.grmcore.program.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:35:43
 */
public class AntProdpaasGrmcoreProgramQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8761528365549519358L;

	/** 
	 * 业管平台立项信息
	 */
	@ApiField("result_data")
	private GrmProjectInfoDTO resultData;

	public void setResultData(GrmProjectInfoDTO resultData) {
		this.resultData = resultData;
	}
	public GrmProjectInfoDTO getResultData( ) {
		return this.resultData;
	}

}
