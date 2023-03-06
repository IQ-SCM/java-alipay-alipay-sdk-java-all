package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KoubeiMerchantRole;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.role.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:15:43
 */
public class KoubeiMerchantOperatorRoleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4257969993512837312L;

	/** 
	 * 角色信息包含角色ID和角色名称,以及权限汇总信息
	 */
	@ApiListField("list")
	@ApiField("koubei_merchant_role")
	private List<KoubeiMerchantRole> list;

	public void setList(List<KoubeiMerchantRole> list) {
		this.list = list;
	}
	public List<KoubeiMerchantRole> getList( ) {
		return this.list;
	}

}