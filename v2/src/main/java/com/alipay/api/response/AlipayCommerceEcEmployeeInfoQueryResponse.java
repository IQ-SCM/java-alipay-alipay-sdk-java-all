package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EmployeeInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:21:43
 */
public class AlipayCommerceEcEmployeeInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5545716111411327549L;

	/** 
	 * 员工信息
	 */
	@ApiField("employee_info")
	private EmployeeInfoDTO employeeInfo;

	public void setEmployeeInfo(EmployeeInfoDTO employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
	public EmployeeInfoDTO getEmployeeInfo( ) {
		return this.employeeInfo;
	}

}
