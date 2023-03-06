package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取配置
 *
 * @author auto create
 * @since 1.0, 2022-12-27 14:17:58
 */
public class GiveConfigVO extends AlipayObject {

	private static final long serialVersionUID = 7213783777192834399L;

	/**
	 * 获取图标
	 */
	@ApiField("give_icon")
	private String giveIcon;

	/**
	 * 获取文案
	 */
	@ApiField("give_title")
	private String giveTitle;

	/**
	 * 获取链接
	 */
	@ApiField("give_url")
	private String giveUrl;

	/**
	 * 获取链接文案
	 */
	@ApiField("give_url_title")
	private String giveUrlTitle;

	public String getGiveIcon() {
		return this.giveIcon;
	}
	public void setGiveIcon(String giveIcon) {
		this.giveIcon = giveIcon;
	}

	public String getGiveTitle() {
		return this.giveTitle;
	}
	public void setGiveTitle(String giveTitle) {
		this.giveTitle = giveTitle;
	}

	public String getGiveUrl() {
		return this.giveUrl;
	}
	public void setGiveUrl(String giveUrl) {
		this.giveUrl = giveUrl;
	}

	public String getGiveUrlTitle() {
		return this.giveUrlTitle;
	}
	public void setGiveUrlTitle(String giveUrlTitle) {
		this.giveUrlTitle = giveUrlTitle;
	}

}