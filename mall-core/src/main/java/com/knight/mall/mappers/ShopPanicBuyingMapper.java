package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.ShopPanicBuying;
import com.knight.mall.query.ShopPanicBuyingQuery;

public interface ShopPanicBuyingMapper  {
	/***/
	ShopPanicBuying load(Long id);

	/***/
	void insert(ShopPanicBuying shopPanicBuying);

	/***/
	void update(ShopPanicBuying shopPanicBuying);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<ShopPanicBuying> queryList(ShopPanicBuyingQuery shopPanicBuyingQuery);

	/***/
	int queryCount(ShopPanicBuyingQuery shopPanicBuyingQuery);
}