package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道中心人群信息对象
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:56:09
 */
public class ChannelPutPlanCrowdDTO extends AlipayObject {

	private static final long serialVersionUID = 6626699397713452852L;

	/**
	 * 外部人群码
	 */
	@ApiField("ext_crowd_key")
	private String extCrowdKey;

	/**
	 * 人群 id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 人群名称
	 */
	@ApiField("name")
	private String name;

	public String getExtCrowdKey() {
		return this.extCrowdKey;
	}
	public void setExtCrowdKey(String extCrowdKey) {
		this.extCrowdKey = extCrowdKey;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}