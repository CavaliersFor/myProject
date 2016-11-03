package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.ProductSku;
import com.knight.mall.query.ProductSkuQuery;

public interface ProductSkuMapper  {
	/***/
	ProductSku load(Long id);

	/***/
	void insert(ProductSku productSku);

	/***/
	void update(ProductSku productSku);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<ProductSku> queryList(ProductSkuQuery productSkuQuery);

	/***/
	int queryCount(ProductSkuQuery productSkuQuery);
}