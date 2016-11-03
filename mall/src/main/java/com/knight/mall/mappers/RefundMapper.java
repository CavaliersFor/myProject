package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Refund;
import com.knight.mall.query.RefundQuery;

public interface RefundMapper  {
	/***/
	Refund load(Long id);

	/***/
	void insert(Refund refund);

	/***/
	void update(Refund refund);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Refund> queryList(RefundQuery refundQuery);

	/***/
	int queryCount(RefundQuery refundQuery);
}