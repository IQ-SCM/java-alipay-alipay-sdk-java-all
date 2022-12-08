package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.audio.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 13:45:25
 */
public class AlipayCommerceIotDeviceAudioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2582351158168532178L;

	/** 
	 * 设备上的语音列表.格式为json字符串. audioId为语音id,playType为播放场景,取值为TRADE或CUSTOM_AUDIO
	 */
	@ApiField("audio_list")
	private String audioList;

	public void setAudioList(String audioList) {
		this.audioList = audioList;
	}
	public String getAudioList( ) {
		return this.audioList;
	}

}
