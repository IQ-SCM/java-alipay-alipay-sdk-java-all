package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.offline response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:16:23
 */
public class AlipayDataDataserviceAdOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 1359885812413463925L;

	/** 
	 * 操作成功外部ID列表
	 */
	@ApiListField("success_id_list")
	@ApiField("string")
	private List<String> successIdList;

	public void setSuccessIdList(List<String> successIdList) {
		this.successIdList = successIdList;
	}
	public List<String> getSuccessIdList( ) {
		return this.successIdList;
	}

}
