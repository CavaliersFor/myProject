package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Buyer;
import com.knight.mall.query.BuyerQuery;

public interface BuyerMapper  {
	/***/
	Buyer load(Long id);

	/***/
	void insert(Buyer buyer);

	/***/
	void update(Buyer buyer);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Buyer> queryList(BuyerQuery buyerQuery);

	/***/
	int queryCount(BuyerQuery buyerQuery);
}