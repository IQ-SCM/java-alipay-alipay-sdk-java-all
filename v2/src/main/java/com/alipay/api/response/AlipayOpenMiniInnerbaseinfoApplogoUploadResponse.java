package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.applogo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:45:10
 */
public class AlipayOpenMiniInnerbaseinfoApplogoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7328716198444299347L;

	/** 
	 * 上传图片结果地址。
图片要求：
1、不能超过256kb 2、支持的图片格式为jpg、jpeg、png 3、长宽比例必须为为1:1
	 */
	@ApiField("app_logo")
	private String appLogo;

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}
	public String getAppLogo( ) {
		return this.appLogo;
	}

}
