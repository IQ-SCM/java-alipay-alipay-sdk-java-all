package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntdataassetsOdpsColumn;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.odpscolumn.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:08:59
 */
public class AlipayDataDataserviceAntdataassetsOdpscolumnQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8662489543726891373L;

	/** 
	 * ODPS的列信息，包含ODPS字段名和字段类型
	 */
	@ApiListField("odps_columns")
	@ApiField("antdataassets_odps_column")
	private List<AntdataassetsOdpsColumn> odpsColumns;

	public void setOdpsColumns(List<AntdataassetsOdpsColumn> odpsColumns) {
		this.odpsColumns = odpsColumns;
	}
	public List<AntdataassetsOdpsColumn> getOdpsColumns( ) {
		return this.odpsColumns;
	}

}