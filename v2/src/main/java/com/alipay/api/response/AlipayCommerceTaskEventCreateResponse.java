package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.task.event.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 01:19:21
 */
public class AlipayCommerceTaskEventCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4185284396873295414L;

	/** 
	 * 模版id
	 */
	@ApiField("event_id")
	private String eventId;

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventId( ) {
		return this.eventId;
	}

}
