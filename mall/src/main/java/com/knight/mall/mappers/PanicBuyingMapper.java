package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.PanicBuying;
import com.knight.mall.query.PanicBuyingQuery;

public interface PanicBuyingMapper  {
	/***/
	PanicBuying load(Long id);

	/***/
	void insert(PanicBuying panicBuying);

	/***/
	void update(PanicBuying panicBuying);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<PanicBuying> queryList(PanicBuyingQuery panicBuyingQuery);

	/***/
	int queryCount(PanicBuyingQuery panicBuyingQuery);
}