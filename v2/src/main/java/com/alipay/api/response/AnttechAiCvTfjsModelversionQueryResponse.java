package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.modelversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:01:28
 */
public class AnttechAiCvTfjsModelversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4669832671436443429L;

	/** 
	 * 对应模型最新版本号
	 */
	@ApiField("model_version")
	private String modelVersion;

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
	public String getModelVersion( ) {
		return this.modelVersion;
	}

}
