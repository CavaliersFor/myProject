package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Trade;
import com.knight.mall.query.TradeQuery;

public interface TradeMapper  {
	/***/
	Trade load(Long id);

	/***/
	void insert(Trade trade);

	/***/
	void update(Trade trade);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Trade> queryList(TradeQuery tradeQuery);

	/***/
	int queryCount(TradeQuery tradeQuery);
}