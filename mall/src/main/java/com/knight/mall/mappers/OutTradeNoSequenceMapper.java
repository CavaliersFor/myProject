package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.OutTradeNoSequence;
import com.knight.mall.query.OutTradeNoSequenceQuery;

public interface OutTradeNoSequenceMapper  {
	/***/
	OutTradeNoSequence load(Long id);

	/***/
	void insert(OutTradeNoSequence outTradeNoSequence);

	/***/
	void update(OutTradeNoSequence outTradeNoSequence);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<OutTradeNoSequence> queryList(OutTradeNoSequenceQuery outTradeNoSequenceQuery);

	/***/
	int queryCount(OutTradeNoSequenceQuery outTradeNoSequenceQuery);
}