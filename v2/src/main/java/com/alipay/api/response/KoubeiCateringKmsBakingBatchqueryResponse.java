package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KmsBakingSalesForecastDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kms.baking.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:03:56
 */
public class KoubeiCateringKmsBakingBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8195735523513896164L;

	/** 
	 * 烘焙商品销量预测
	 */
	@ApiListField("baking_sales_forecast_data")
	@ApiField("kms_baking_sales_forecast_d_t_o")
	private List<KmsBakingSalesForecastDTO> bakingSalesForecastData;

	public void setBakingSalesForecastData(List<KmsBakingSalesForecastDTO> bakingSalesForecastData) {
		this.bakingSalesForecastData = bakingSalesForecastData;
	}
	public List<KmsBakingSalesForecastDTO> getBakingSalesForecastData( ) {
		return this.bakingSalesForecastData;
	}

}
