package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ededuct.forecast.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:50:13
 */
public class AlipayEbppEdeductForecastQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8148665776746475868L;

	/** 
	 * 是否符合预期，true则说明符合预测，false则说明不符合预测，需要进行拦截。
	 */
	@ApiField("forecast_expect")
	private Boolean forecastExpect;

	public void setForecastExpect(Boolean forecastExpect) {
		this.forecastExpect = forecastExpect;
	}
	public Boolean getForecastExpect( ) {
		return this.forecastExpect;
	}

}
