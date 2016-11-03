package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Logistics;
import com.knight.mall.query.LogisticsQuery;

public interface LogisticsMapper  {
	/***/
	Logistics load(Long id);

	/***/
	void insert(Logistics logistics);

	/***/
	void update(Logistics logistics);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Logistics> queryList(LogisticsQuery logisticsQuery);

	/***/
	int queryCount(LogisticsQuery logisticsQuery);
}