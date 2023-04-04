package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OwnedSystemPrivacyField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.privacy.systemfield.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:42:13
 */
public class AlipayOpenMiniPrivacySystemfieldQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5261516378134762135L;

	/** 
	 * 小程序使用的系统定义的隐私字段
	 */
	@ApiListField("system_privacy_fields")
	@ApiField("owned_system_privacy_field")
	private List<OwnedSystemPrivacyField> systemPrivacyFields;

	public void setSystemPrivacyFields(List<OwnedSystemPrivacyField> systemPrivacyFields) {
		this.systemPrivacyFields = systemPrivacyFields;
	}
	public List<OwnedSystemPrivacyField> getSystemPrivacyFields( ) {
		return this.systemPrivacyFields;
	}

}
