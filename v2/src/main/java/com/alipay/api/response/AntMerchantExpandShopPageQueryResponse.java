package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopQueryOpenApiVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 19:06:48
 */
public class AntMerchantExpandShopPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1814194967839323824L;

	/** 
	 * 门店详情
	 */
	@ApiListField("shop_infos")
	@ApiField("shop_query_open_api_v_o")
	private List<ShopQueryOpenApiVO> shopInfos;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setShopInfos(List<ShopQueryOpenApiVO> shopInfos) {
		this.shopInfos = shopInfos;
	}
	public List<ShopQueryOpenApiVO> getShopInfos( ) {
		return this.shopInfos;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
