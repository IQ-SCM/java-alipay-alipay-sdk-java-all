package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.editor.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 18:56:20
 */
public class AlipayMarketingToolFengdieEditorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5175528171672132138L;

	/** 
	 * 凤蝶编辑器访问地址，可通过iframe集成在后台系统，由系统用户编辑H5应用内容。url的有效期为15秒，因此每次需要编辑h5页面的时候应该重新调用Api生成。
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}