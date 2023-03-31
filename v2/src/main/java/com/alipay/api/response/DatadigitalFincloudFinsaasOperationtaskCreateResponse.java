package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.operationtask.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 18:19:58
 */
public class DatadigitalFincloudFinsaasOperationtaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6459766249287281754L;

	/** 
	 * operation_task_id + 运营任务创建 + 数据库
	 */
	@ApiField("operation_task_id")
	private String operationTaskId;

	public void setOperationTaskId(String operationTaskId) {
		this.operationTaskId = operationTaskId;
	}
	public String getOperationTaskId( ) {
		return this.operationTaskId;
	}

}
