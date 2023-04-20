package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交代商户签约、创建应用事务
 *
 * @author auto create
 * @since 1.0, 2023-04-17 13:46:45
 */
public class AlipayOpenAgentConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3296869413356466177L;

	/**
	 * ISV 代商户操作事务编号，通过调用alipay.open.agent.create(开启代商户签约、创建应用事务)接口返回，详见 https://opendocs.alipay.com/apis/api_50/alipay.open.agent.create/  。
	 */
	@ApiField("batch_no")
	private String batchNo;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

}
