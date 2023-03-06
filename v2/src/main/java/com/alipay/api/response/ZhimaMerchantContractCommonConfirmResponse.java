package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.common.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:29:03
 */
public class ZhimaMerchantContractCommonConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1411527764876317866L;

	/** 
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/** 
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

}