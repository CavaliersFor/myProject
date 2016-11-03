package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Shop;
import com.knight.mall.query.ShopQuery;

public interface ShopMapper  {
	/***/
	Shop load(Long id);

	/***/
	void insert(Shop shop);

	/***/
	void update(Shop shop);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Shop> queryList(ShopQuery shopQuery);

	/***/
	int queryCount(ShopQuery shopQuery);
}