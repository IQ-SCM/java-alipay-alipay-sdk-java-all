package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GavintestNewonline;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.biz.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:15:51
 */
public class AlipayOpenBizCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7231868158124957881L;

	/** 
	 * 1
	 */
	@ApiField("a")
	private String a;

	/** 
	 * 211
	 */
	@ApiField("b")
	private GavintestNewonline b;

	/** 
	 * 1
	 */
	@ApiField("c")
	private String c;

	public void setA(String a) {
		this.a = a;
	}
	public String getA( ) {
		return this.a;
	}

	public void setB(GavintestNewonline b) {
		this.b = b;
	}
	public GavintestNewonline getB( ) {
		return this.b;
	}

	public void setC(String c) {
		this.c = c;
	}
	public String getC( ) {
		return this.c;
	}

}
