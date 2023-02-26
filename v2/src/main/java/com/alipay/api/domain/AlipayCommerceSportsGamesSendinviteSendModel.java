package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 向好友发送邀请消息
 *
 * @author auto create
 * @since 1.0, 2022-12-13 13:24:15
 */
public class AlipayCommerceSportsGamesSendinviteSendModel extends AlipayObject {

	private static final long serialVersionUID = 1647599738385921972L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 信息描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 好友open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id
	 */
	@ApiField("self_open_id")
	private String selfOpenId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSelfOpenId() {
		return this.selfOpenId;
	}
	public void setSelfOpenId(String selfOpenId) {
		this.selfOpenId = selfOpenId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
