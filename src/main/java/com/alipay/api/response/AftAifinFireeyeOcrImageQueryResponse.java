package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OcrIdentifyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: aft.aifin.fireeye.ocr.image.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:26:02
 */
public class AftAifinFireeyeOcrImageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4873889618779822183L;

	/** 
	 * 识别结果字段，这个是一个JSON字符串
	 */
	@ApiField("content")
	private OcrIdentifyResult content;

	public void setContent(OcrIdentifyResult content) {
		this.content = content;
	}
	public OcrIdentifyResult getContent( ) {
		return this.content;
	}

}
