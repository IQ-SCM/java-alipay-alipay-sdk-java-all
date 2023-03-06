package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户发票包的明细信息
 *
 * @author auto create
 * @since 1.0, 2022-10-10 14:32:16
 */
public class AlipayEbppInvoiceEinvpackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5339712693528983755L;

	/**
	 * 加密过的uid。获取详情参见 <a href="https://opendocs.alipay.com/open/017fwh">"推"模式发票报销</a>。
	 */
	@ApiField("encrypted_uid")
	private String encryptedUid;

	/**
	 * 发票包id。获取详情参见 <a href="https://opendocs.alipay.com/open/017fwh">"推"模式发票报销</a>。
	 */
	@ApiField("package_id")
	private String packageId;

	public String getEncryptedUid() {
		return this.encryptedUid;
	}
	public void setEncryptedUid(String encryptedUid) {
		this.encryptedUid = encryptedUid;
	}

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

}