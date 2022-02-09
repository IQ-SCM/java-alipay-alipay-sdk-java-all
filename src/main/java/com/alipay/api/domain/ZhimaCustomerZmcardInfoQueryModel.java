package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻证信息查询
 *
 * @author auto create
 * @since 1.0, 2022-02-07 13:18:22
 */
public class ZhimaCustomerZmcardInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5426725876836378196L;

	/**
	 * 查看者的证件号,A申请查看B的芝麻证信息，则传入A的证件号，若是自己查看自己的，则传入自己的证件号，无法确定查看者，则传入空
	 */
	@ApiField("guest_cert_no")
	private String guestCertNo;

	/**
	 * 芝麻证被查看人的证件号
	 */
	@ApiField("host_cert_no")
	private String hostCertNo;

	/**
	 * 被查看者证件类型，取值如下：
IDENTITY_CARD：身份证、
PASSPORT：护照、
BACK_HOMETOWN_CARD：回乡证、
HOME_VISIT_PERMIT_TAIWAN：台湾居民通行证、
HOME_VISIT_PERMIT_HK_MC：港澳来往通行证、
HK_MC_CARD：港澳证件，必填选项
	 */
	@ApiField("host_cert_type")
	private String hostCertType;

	public String getGuestCertNo() {
		return this.guestCertNo;
	}
	public void setGuestCertNo(String guestCertNo) {
		this.guestCertNo = guestCertNo;
	}

	public String getHostCertNo() {
		return this.hostCertNo;
	}
	public void setHostCertNo(String hostCertNo) {
		this.hostCertNo = hostCertNo;
	}

	public String getHostCertType() {
		return this.hostCertType;
	}
	public void setHostCertType(String hostCertType) {
		this.hostCertType = hostCertType;
	}

}