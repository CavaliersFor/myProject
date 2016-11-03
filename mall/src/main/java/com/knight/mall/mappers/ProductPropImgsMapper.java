package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.ProductPropImgs;
import com.knight.mall.query.ProductPropImgsQuery;

public interface ProductPropImgsMapper  {
	/***/
	ProductPropImgs load(Long id);

	/***/
	void insert(ProductPropImgs productPropImgs);

	/***/
	void update(ProductPropImgs productPropImgs);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<ProductPropImgs> queryList(ProductPropImgsQuery productPropImgsQuery);

	/***/
	int queryCount(ProductPropImgsQuery productPropImgsQuery);
}