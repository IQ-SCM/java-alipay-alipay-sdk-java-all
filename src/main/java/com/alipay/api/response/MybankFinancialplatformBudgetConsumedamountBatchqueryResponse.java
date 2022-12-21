package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BkdfmacBizActionConsumedAmountsDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.financialplatform.budget.consumedamount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 16:36:39
 */
public class MybankFinancialplatformBudgetConsumedamountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5366456415988766492L;

	/** 
	 * 根据BizUkIds查询出的占用情况
	 */
	@ApiListField("result_data")
	@ApiField("bkdfmac_biz_action_consumed_amounts_d_t_o")
	private List<BkdfmacBizActionConsumedAmountsDTO> resultData;

	/** 
	 * 错误具体信息描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<BkdfmacBizActionConsumedAmountsDTO> resultData) {
		this.resultData = resultData;
	}
	public List<BkdfmacBizActionConsumedAmountsDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}