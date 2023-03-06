package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署流程归档
 *
 * @author auto create
 * @since 1.0, 2020-08-21 10:27:19
 */
public class AlipayEcoSignFlowFinishModel extends AlipayObject {

	private static final long serialVersionUID = 4149814582925534494L;

	/**
	 * 流程id
	 */
	@ApiField("flow_id")
	private String flowId;

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

}