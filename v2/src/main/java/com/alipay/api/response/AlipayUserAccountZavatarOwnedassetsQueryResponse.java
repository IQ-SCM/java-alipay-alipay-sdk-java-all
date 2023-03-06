package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AvatarAsianAssetVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.zavatar.ownedassets.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 10:16:39
 */
public class AlipayUserAccountZavatarOwnedassetsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2382912158417846691L;

	/** 
	 * 数字人服装vo
	 */
	@ApiListField("avatar_asset_suit_v_os")
	@ApiField("avatar_asian_asset_v_o")
	private List<AvatarAsianAssetVO> avatarAssetSuitVOs;

	public void setAvatarAssetSuitVOs(List<AvatarAsianAssetVO> avatarAssetSuitVOs) {
		this.avatarAssetSuitVOs = avatarAssetSuitVOs;
	}
	public List<AvatarAsianAssetVO> getAvatarAssetSuitVOs( ) {
		return this.avatarAssetSuitVOs;
	}

}