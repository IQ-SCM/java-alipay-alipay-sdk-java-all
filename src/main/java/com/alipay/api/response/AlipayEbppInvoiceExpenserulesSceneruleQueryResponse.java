package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StandardRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.scenerule.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-24 20:10:29
 */
public class AlipayEbppInvoiceExpenserulesSceneruleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6513432293986246769L;

	/** 
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 费控制度
	 */
	@ApiListField("standard_rule_info_list")
	@ApiField("standard_rule_info")
	private List<StandardRuleInfo> standardRuleInfoList;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setStandardRuleInfoList(List<StandardRuleInfo> standardRuleInfoList) {
		this.standardRuleInfoList = standardRuleInfoList;
	}
	public List<StandardRuleInfo> getStandardRuleInfoList( ) {
		return this.standardRuleInfoList;
	}

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}