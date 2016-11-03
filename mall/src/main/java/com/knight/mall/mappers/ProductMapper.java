package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Product;
import com.knight.mall.query.ProductQuery;

public interface ProductMapper  {
	/***/
	Product load(Long id);

	/***/
	void insert(Product product);

	/***/
	void update(Product product);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Product> queryList(ProductQuery productQuery);

	/***/
	int queryCount(ProductQuery productQuery);
}