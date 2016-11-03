package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.EnterpriseDeliverReturn;
import com.knight.mall.query.EnterpriseDeliverReturnQuery;

public interface EnterpriseDeliverReturnMapper  {
	/***/
	EnterpriseDeliverReturn load(Long id);

	/***/
	void insert(EnterpriseDeliverReturn enterpriseDeliverReturn);

	/***/
	void update(EnterpriseDeliverReturn enterpriseDeliverReturn);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<EnterpriseDeliverReturn> queryList(EnterpriseDeliverReturnQuery enterpriseDeliverReturnQuery);

	/***/
	int queryCount(EnterpriseDeliverReturnQuery enterpriseDeliverReturnQuery);
}