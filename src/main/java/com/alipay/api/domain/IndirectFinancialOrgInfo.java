package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 金融机构信息
 *
 * @author auto create
 * @since 1.0, 2022-06-15 13:50:00
 */
public class IndirectFinancialOrgInfo extends AlipayObject {

	private static final long serialVersionUID = 2382263147558354271L;

	/**
	 * 金融机构许可证图片，最多五张（使用图片上传接口）
	 */
	@ApiListField("financial_org_cert_img")
	@ApiField("string")
	private List<String> financialOrgCertImg;

	/**
	 * 机构（INST）、银行业(BANK)、支付机构(PAYMENT)、保险业(INSURANCE)、交易及结算类金融机构(SETTLE)、OTHER(OTHER)
	 */
	@ApiField("financial_org_type")
	private String financialOrgType;

	public List<String> getFinancialOrgCertImg() {
		return this.financialOrgCertImg;
	}
	public void setFinancialOrgCertImg(List<String> financialOrgCertImg) {
		this.financialOrgCertImg = financialOrgCertImg;
	}

	public String getFinancialOrgType() {
		return this.financialOrgType;
	}
	public void setFinancialOrgType(String financialOrgType) {
		this.financialOrgType = financialOrgType;
	}

}