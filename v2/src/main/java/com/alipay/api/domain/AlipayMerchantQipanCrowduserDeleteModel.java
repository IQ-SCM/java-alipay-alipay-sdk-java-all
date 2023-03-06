package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家用户人群包中删除用户
 *
 * @author auto create
 * @since 1.0, 2023-01-17 20:27:16
 */
public class AlipayMerchantQipanCrowduserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5299914928497938614L;

	/**
	 * 支付宝人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 人群包中需剔除的用户列表 单次上传用户数上限为1000，若用户量过大可分批上传
	 */
	@ApiListField("user_list")
	@ApiField("qipan_merchant_crowd_user")
	private List<QipanMerchantCrowdUser> userList;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public List<QipanMerchantCrowdUser> getUserList() {
		return this.userList;
	}
	public void setUserList(List<QipanMerchantCrowdUser> userList) {
		this.userList = userList;
	}

}