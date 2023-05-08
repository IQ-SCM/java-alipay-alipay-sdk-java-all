package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.specgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:08:13
 */
public class KoubeiCateringDishSpecgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8513368314385571844L;

	/** 
	 * 12323
	 */
	@ApiField("kbdish_spec_group_id")
	private String kbdishSpecGroupId;

	public void setKbdishSpecGroupId(String kbdishSpecGroupId) {
		this.kbdishSpecGroupId = kbdishSpecGroupId;
	}
	public String getKbdishSpecGroupId( ) {
		return this.kbdishSpecGroupId;
	}

}
