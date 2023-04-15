package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:16:53
 */
public class AlipayCommerceIotMdeviceprodAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1784781675189997586L;

	/** 
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 用户pid
	 */
	@ApiField("pid")
	private String pid;

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

}
