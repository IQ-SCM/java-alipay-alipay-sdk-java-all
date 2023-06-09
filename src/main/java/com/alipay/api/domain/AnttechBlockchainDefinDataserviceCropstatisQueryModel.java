package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 农作物汇总信息查询
 *
 * @author auto create
 * @since 1.0, 2022-09-27 15:12:37
 */
public class AnttechBlockchainDefinDataserviceCropstatisQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1553611296128823428L;

	/**
	 * 作物编码条件汇总
	 */
	@ApiField("crop_code")
	private String cropCode;

	/**
	 * 作物长势等级条件汇总
	 */
	@ApiField("growth_strength")
	private Long growthStrength;

	/**
	 * 长势是否预警条件汇总
	 */
	@ApiField("is_growth_warn")
	private Boolean isGrowthWarn;

	/**
	 * 是否收割完成条件汇总
	 */
	@ApiField("is_harvested")
	private Boolean isHarvested;

	/**
	 * 区块编码列表
	 */
	@ApiListField("region_codes")
	@ApiField("string")
	private List<String> regionCodes;

	public String getCropCode() {
		return this.cropCode;
	}
	public void setCropCode(String cropCode) {
		this.cropCode = cropCode;
	}

	public Long getGrowthStrength() {
		return this.growthStrength;
	}
	public void setGrowthStrength(Long growthStrength) {
		this.growthStrength = growthStrength;
	}

	public Boolean getIsGrowthWarn() {
		return this.isGrowthWarn;
	}
	public void setIsGrowthWarn(Boolean isGrowthWarn) {
		this.isGrowthWarn = isGrowthWarn;
	}

	public Boolean getIsHarvested() {
		return this.isHarvested;
	}
	public void setIsHarvested(Boolean isHarvested) {
		this.isHarvested = isHarvested;
	}

	public List<String> getRegionCodes() {
		return this.regionCodes;
	}
	public void setRegionCodes(List<String> regionCodes) {
		this.regionCodes = regionCodes;
	}

}
