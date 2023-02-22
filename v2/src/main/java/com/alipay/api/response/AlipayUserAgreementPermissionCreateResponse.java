package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.permission.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:08:03
 */
public class AlipayUserAgreementPermissionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8236383896345834121L;

	/** 
	 * 商户代扣扣款许可
	 */
	@ApiField("deduct_permission")
	private String deductPermission;

	/** 
	 * 商户代扣扣款许可生效结束时间
	 */
	@ApiField("effective_time_end")
	private String effectiveTimeEnd;

	/** 
	 * 商户代扣扣款许可生效开始时间
	 */
	@ApiField("effective_time_start")
	private String effectiveTimeStart;

	public void setDeductPermission(String deductPermission) {
		this.deductPermission = deductPermission;
	}
	public String getDeductPermission( ) {
		return this.deductPermission;
	}

	public void setEffectiveTimeEnd(String effectiveTimeEnd) {
		this.effectiveTimeEnd = effectiveTimeEnd;
	}
	public String getEffectiveTimeEnd( ) {
		return this.effectiveTimeEnd;
	}

	public void setEffectiveTimeStart(String effectiveTimeStart) {
		this.effectiveTimeStart = effectiveTimeStart;
	}
	public String getEffectiveTimeStart( ) {
		return this.effectiveTimeStart;
	}

}
