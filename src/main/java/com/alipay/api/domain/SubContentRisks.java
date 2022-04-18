package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 被拆分的子文件
 *
 * @author auto create
 * @since 1.0, 2022-04-13 14:02:25
 */
public class SubContentRisks extends AlipayObject {

	private static final long serialVersionUID = 3744911874371145424L;

	/**
	 * 能否打标true/false
	 */
	@ApiField("can_mark")
	private Boolean canMark;

	/**
	 * 文件素材id，解语花生成的审核素材文件id,查询物料过审规则会用到这个file_id,物料维度打标也会用到这个file_id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 经过素材处理后生成的文件url信息
	 */
	@ApiField("generated_url")
	private String generatedUrl;

	/**
	 * 对应外部传入的原始文件url信息
	 */
	@ApiField("origin_file")
	private String originFile;

	/**
	 * 原始文件名
	 */
	@ApiField("origin_name")
	private String originName;

	/**
	 * 风险规则详情
	 */
	@ApiListField("risks")
	@ApiField("content_risk_detail")
	private List<ContentRiskDetail> risks;

	public Boolean getCanMark() {
		return this.canMark;
	}
	public void setCanMark(Boolean canMark) {
		this.canMark = canMark;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getGeneratedUrl() {
		return this.generatedUrl;
	}
	public void setGeneratedUrl(String generatedUrl) {
		this.generatedUrl = generatedUrl;
	}

	public String getOriginFile() {
		return this.originFile;
	}
	public void setOriginFile(String originFile) {
		this.originFile = originFile;
	}

	public String getOriginName() {
		return this.originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public List<ContentRiskDetail> getRisks() {
		return this.risks;
	}
	public void setRisks(List<ContentRiskDetail> risks) {
		this.risks = risks;
	}

}