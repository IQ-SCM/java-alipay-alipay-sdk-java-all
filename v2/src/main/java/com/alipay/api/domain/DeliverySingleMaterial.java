package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放单素材资源
 *
 * @author auto create
 * @since 1.0, 2023-04-19 14:29:56
 */
public class DeliverySingleMaterial extends AlipayObject {

	private static final long serialVersionUID = 8323914822152653258L;

	/**
	 * 投放计划图片素材。通过接口alipay.marketing.material.image.upload上传图片返回的resource_id。
	 */
	@ApiField("delivery_image")
	private String deliveryImage;

	public String getDeliveryImage() {
		return this.deliveryImage;
	}
	public void setDeliveryImage(String deliveryImage) {
		this.deliveryImage = deliveryImage;
	}

}
