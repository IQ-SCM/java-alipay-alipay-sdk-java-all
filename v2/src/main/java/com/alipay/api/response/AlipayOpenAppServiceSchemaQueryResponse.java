package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.schema.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:05:31
 */
public class AlipayOpenAppServiceSchemaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4882999969412767686L;

	/** 
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 服务schema版本
	 */
	@ApiField("schema_version")
	private String schemaVersion;

	/** 
	 * 服务schema
	 */
	@ApiField("schema_xml")
	private String schemaXml;

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
	}
	public String getSchemaVersion( ) {
		return this.schemaVersion;
	}

	public void setSchemaXml(String schemaXml) {
		this.schemaXml = schemaXml;
	}
	public String getSchemaXml( ) {
		return this.schemaXml;
	}

}
