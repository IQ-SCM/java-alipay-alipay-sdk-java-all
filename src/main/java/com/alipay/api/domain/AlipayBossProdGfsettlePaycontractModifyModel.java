package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁财务统一结算应付付款条款修改
 *
 * @author auto create
 * @since 1.0, 2022-09-30 15:18:01
 */
public class AlipayBossProdGfsettlePaycontractModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5856327787441217756L;

	/**
	 * 修改的付款条款信息
	 */
	@ApiField("paycontract")
	private PayContractDTO paycontract;

	public PayContractDTO getPaycontract() {
		return this.paycontract;
	}
	public void setPaycontract(PayContractDTO paycontract) {
		this.paycontract = paycontract;
	}

}
