package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放素材信息
 *
 * @author auto create
 * @since 1.0, 2023-04-19 14:29:56
 */
public class DeliveryMaterial extends AlipayObject {

	private static final long serialVersionUID = 8461412736548325465L;

	/**
	 * 单素材对象
	 */
	@ApiField("delivery_single_material")
	private DeliverySingleMaterial deliverySingleMaterial;

	/**
	 * 素材ID，通过alipay.marketing.material.create接口提供的素材组
	 */
	@ApiListField("material_id_list")
	@ApiField("string")
	private List<String> materialIdList;

	public DeliverySingleMaterial getDeliverySingleMaterial() {
		return this.deliverySingleMaterial;
	}
	public void setDeliverySingleMaterial(DeliverySingleMaterial deliverySingleMaterial) {
		this.deliverySingleMaterial = deliverySingleMaterial;
	}

	public List<String> getMaterialIdList() {
		return this.materialIdList;
	}
	public void setMaterialIdList(List<String> materialIdList) {
		this.materialIdList = materialIdList;
	}

}
