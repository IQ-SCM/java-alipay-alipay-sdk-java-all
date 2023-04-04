package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.serviceproduct.update response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 09:36:31
 */
public class AlipayEcoMycarMaintainServiceproductUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3328637355798278678L;

	/** 
	 * 车主平台生成的产品编号
新增：必填
	 */
	@ApiField("product_id")
	private Long productId;

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getProductId( ) {
		return this.productId;
	}

}
