package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuestInstanceDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.quest.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:04:57
 */
public class AlipaySocialBaseQuestInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2617246927298369415L;

	/** 
	 * 返回请求小目标实例集合
	 */
	@ApiListField("instances")
	@ApiField("quest_instance_d_o")
	private List<QuestInstanceDO> instances;

	public void setInstances(List<QuestInstanceDO> instances) {
		this.instances = instances;
	}
	public List<QuestInstanceDO> getInstances( ) {
		return this.instances;
	}

}
