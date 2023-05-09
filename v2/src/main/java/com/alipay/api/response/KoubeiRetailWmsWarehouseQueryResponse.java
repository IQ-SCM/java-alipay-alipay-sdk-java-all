package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WarehouseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.warehouse.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:10:12
 */
public class KoubeiRetailWmsWarehouseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6677324212751816552L;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 仓库信息
	 */
	@ApiListField("warehouses")
	@ApiField("warehouse_v_o")
	private List<WarehouseVO> warehouses;

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setWarehouses(List<WarehouseVO> warehouses) {
		this.warehouses = warehouses;
	}
	public List<WarehouseVO> getWarehouses( ) {
		return this.warehouses;
	}

}
