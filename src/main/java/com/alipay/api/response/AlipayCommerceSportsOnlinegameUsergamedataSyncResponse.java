package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserOnlineGameDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.onlinegame.usergamedata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-20 14:49:24
 */
public class AlipayCommerceSportsOnlinegameUsergamedataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4446745435191373392L;

	/** 
	 * 用户参赛数据信息
	 */
	@ApiListField("user_online_game_data_info_list")
	@ApiField("user_online_game_data_info")
	private List<UserOnlineGameDataInfo> userOnlineGameDataInfoList;

	public void setUserOnlineGameDataInfoList(List<UserOnlineGameDataInfo> userOnlineGameDataInfoList) {
		this.userOnlineGameDataInfoList = userOnlineGameDataInfoList;
	}
	public List<UserOnlineGameDataInfo> getUserOnlineGameDataInfoList( ) {
		return this.userOnlineGameDataInfoList;
	}

}