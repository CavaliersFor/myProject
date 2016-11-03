package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.ShopIndex;
import com.knight.mall.query.ShopIndexQuery;

public interface ShopIndexMapper  {
	/***/
	ShopIndex load(Long id);

	/***/
	void insert(ShopIndex shopIndex);

	/***/
	void update(ShopIndex shopIndex);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<ShopIndex> queryList(ShopIndexQuery shopIndexQuery);

	/***/
	int queryCount(ShopIndexQuery shopIndexQuery);
}