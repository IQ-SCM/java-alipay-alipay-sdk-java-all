package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品属性
 *
 * @author auto create
 * @since 1.0, 2023-03-29 15:28:19
 */
public class AttributeVO extends AlipayObject {

	private static final long serialVersionUID = 2638543596314552768L;

	/**
	 * 属性值长度区间,上下限,分隔,属性组件类型是input时可用
	 */
	@ApiField("length")
	private String length;

	/**
	 * 属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 属性值范围区间,上下限,分隔,属性组件类型是number_picker时可用
	 */
	@ApiField("range")
	private String range;

	/**
	 * 是否必填属性
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 属性组件类型,文本输入框:input,单选框:select_one,数值输入框:number_picker
	 */
	@ApiField("type")
	private String type;

	/**
	 * 属性值枚举,多值;分隔
	 */
	@ApiField("value")
	private String value;

	public String getLength() {
		return this.length;
	}
	public void setLength(String length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRange() {
		return this.range;
	}
	public void setRange(String range) {
		this.range = range;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
