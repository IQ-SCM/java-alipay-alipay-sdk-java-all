package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerclientinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:56:46
 */
public class AlipayOpenMiniInnerclientinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1678426394938284339L;

	/** 
	 * 端bundleId
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/** 
	 * 端的名称
	 */
	@ApiField("bundle_name")
	private String bundleName;

	/** 
	 * 端ID
	 */
	@ApiField("client_id")
	private Long clientId;

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleId( ) {
		return this.bundleId;
	}

	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}
	public String getBundleName( ) {
		return this.bundleName;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public Long getClientId( ) {
		return this.clientId;
	}

}
