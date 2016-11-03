package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.BuyerAddress;
import com.knight.mall.query.BuyerAddressQuery;

public interface BuyerAddressMapper  {
	/***/
	BuyerAddress load(Long id);

	/***/
	void insert(BuyerAddress buyerAddress);

	/***/
	void update(BuyerAddress buyerAddress);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<BuyerAddress> queryList(BuyerAddressQuery buyerAddressQuery);

	/***/
	int queryCount(BuyerAddressQuery buyerAddressQuery);
}