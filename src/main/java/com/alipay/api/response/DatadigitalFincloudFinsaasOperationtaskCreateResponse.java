package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.operationtask.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-27 16:41:47
 */
public class DatadigitalFincloudFinsaasOperationtaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5549491632913987618L;

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