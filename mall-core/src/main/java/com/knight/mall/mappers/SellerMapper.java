package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Seller;
import com.knight.mall.query.SellerQuery;

public interface SellerMapper  {
	/***/
	Seller load(Long id);

	/***/
	void insert(Seller seller);

	/***/
	void update(Seller seller);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Seller> queryList(SellerQuery sellerQuery);

	/***/
	int queryCount(SellerQuery sellerQuery);
}