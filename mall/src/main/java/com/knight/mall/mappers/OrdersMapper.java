package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Orders;
import com.knight.mall.query.OrdersQuery;

public interface OrdersMapper  {
	/***/
	Orders load(Long id);

	/***/
	void insert(Orders orders);

	/***/
	void update(Orders orders);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Orders> queryList(OrdersQuery ordersQuery);

	/***/
	int queryCount(OrdersQuery ordersQuery);
}