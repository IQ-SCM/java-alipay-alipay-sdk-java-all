package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfaccenter.consolidation.accept response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:12:52
 */
public class AlipayBossFncGfaccenterConsolidationAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 5397839899728668766L;

	/** 
	 * 是否并账成功
	 */
	@ApiField("consolidation_success")
	private Boolean consolidationSuccess;

	/** 
	 * 是否可以重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	/** 
	 * 结果信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setConsolidationSuccess(Boolean consolidationSuccess) {
		this.consolidationSuccess = consolidationSuccess;
	}
	public Boolean getConsolidationSuccess( ) {
		return this.consolidationSuccess;
	}

	public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}
	public Boolean getNeedRetry( ) {
		return this.needRetry;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}