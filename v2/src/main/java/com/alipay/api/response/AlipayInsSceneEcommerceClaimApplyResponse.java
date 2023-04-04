package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenClaimDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.claim.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:01:45
 */
public class AlipayInsSceneEcommerceClaimApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1537595653951136812L;

	/** 
	 * 理赔单摘要
	 */
	@ApiField("claim_digest")
	private InsOpenClaimDigestDTO claimDigest;

	public void setClaimDigest(InsOpenClaimDigestDTO claimDigest) {
		this.claimDigest = claimDigest;
	}
	public InsOpenClaimDigestDTO getClaimDigest( ) {
		return this.claimDigest;
	}

}
