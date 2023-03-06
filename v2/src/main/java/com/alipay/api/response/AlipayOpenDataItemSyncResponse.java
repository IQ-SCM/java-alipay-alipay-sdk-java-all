package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.data.item.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:42:12
 */
public class AlipayOpenDataItemSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1127583333922381163L;

	/** 
	 * 返回更新成功的外部id
	 */
	@ApiField("external_id")
	private String externalId;

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalId( ) {
		return this.externalId;
	}

}