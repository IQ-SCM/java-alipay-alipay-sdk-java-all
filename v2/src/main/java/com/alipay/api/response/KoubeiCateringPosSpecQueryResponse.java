package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpecEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.spec.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:20:21
 */
public class KoubeiCateringPosSpecQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5185598161476446245L;

	/** 
	 * 规格列表
	 */
	@ApiListField("specs")
	@ApiField("spec_entity")
	private List<SpecEntity> specs;

	public void setSpecs(List<SpecEntity> specs) {
		this.specs = specs;
	}
	public List<SpecEntity> getSpecs( ) {
		return this.specs;
	}

}
