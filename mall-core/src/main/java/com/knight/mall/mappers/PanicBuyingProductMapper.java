package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.PanicBuyingProduct;
import com.knight.mall.query.PanicBuyingProductQuery;

public interface PanicBuyingProductMapper  {
	/***/
	PanicBuyingProduct load(Long id);

	/***/
	void insert(PanicBuyingProduct panicBuyingProduct);

	/***/
	void update(PanicBuyingProduct panicBuyingProduct);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<PanicBuyingProduct> queryList(PanicBuyingProductQuery panicBuyingProductQuery);

	/***/
	int queryCount(PanicBuyingProductQuery panicBuyingProductQuery);
}