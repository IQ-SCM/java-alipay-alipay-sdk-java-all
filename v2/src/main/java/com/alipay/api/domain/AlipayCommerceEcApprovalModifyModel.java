package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改审批单
 *
 * @author auto create
 * @since 1.0, 2023-02-06 11:15:27
 */
public class AlipayCommerceEcApprovalModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4272455966878811284L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 审批单关联制度id列表
	 */
	@ApiListField("institution_id_list")
	@ApiField("string")
	private List<String> institutionIdList;

	/**
	 * 外部平台审批单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	/**
	 * 事由
	 */
	@ApiField("purpose")
	private String purpose;

	/**
	 * 同行人信息列表
	 */
	@ApiListField("traveler_list")
	@ApiField("approval_traveler_d_t_o")
	private List<ApprovalTravelerDTO> travelerList;

	/**
	 * 行程信息列表
	 */
	@ApiListField("trip_info_list")
	@ApiField("approval_trip_d_t_o")
	private List<ApprovalTripDTO> tripInfoList;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<String> getInstitutionIdList() {
		return this.institutionIdList;
	}
	public void setInstitutionIdList(List<String> institutionIdList) {
		this.institutionIdList = institutionIdList;
	}

	public String getPlatformApprovalId() {
		return this.platformApprovalId;
	}
	public void setPlatformApprovalId(String platformApprovalId) {
		this.platformApprovalId = platformApprovalId;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public List<ApprovalTravelerDTO> getTravelerList() {
		return this.travelerList;
	}
	public void setTravelerList(List<ApprovalTravelerDTO> travelerList) {
		this.travelerList = travelerList;
	}

	public List<ApprovalTripDTO> getTripInfoList() {
		return this.tripInfoList;
	}
	public void setTripInfoList(List<ApprovalTripDTO> tripInfoList) {
		this.tripInfoList = tripInfoList;
	}

}
