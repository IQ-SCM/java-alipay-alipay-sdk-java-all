package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品自定义属性
 *
 * @author auto create
 * @since 1.0, 2023-03-03 14:21:02
 */
public class AppItemFeature extends AlipayObject {

	private static final long serialVersionUID = 7585848615662198234L;

	/**
	 * 属性key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}