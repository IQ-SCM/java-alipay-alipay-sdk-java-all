package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 22:16:10
 */
public class AlipayPcreditHuabeiMobileauthTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6154785432345195317L;

	/** 
	 * 模板查询返回JSON信息，参考
PcreditRpcBaseResult<MobileMemberTemplateInfoVO>
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
