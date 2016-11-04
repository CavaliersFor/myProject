package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.TradeNoSequence;
import com.knight.mall.query.TradeNoSequenceQuery;

public interface TradeNoSequenceMapper  {
	/***/
	TradeNoSequence load(Long id);

	/***/
	void insert(TradeNoSequence tradeNoSequence);

	/***/
	void update(TradeNoSequence tradeNoSequence);

	/***/
	void updateStatus(@Param("id")  Long id, @Param("status") Serializable status);

	/***/
	void delete( Long id);

	/***/
	List<TradeNoSequence> queryList(TradeNoSequenceQuery tradeNoSequenceQuery);

	/***/
	int queryCount(TradeNoSequenceQuery tradeNoSequenceQuery);
}