package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Discount;
import com.knight.mall.query.DiscountQuery;

public interface DiscountMapper  {
	/***/
	Discount load(Long id);

	/***/
	void insert(Discount discount);

	/***/
	void update(Discount discount);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Discount> queryList(DiscountQuery discountQuery);

	/***/
	int queryCount(DiscountQuery discountQuery);
}