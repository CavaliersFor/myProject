package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Enterprise;
import com.knight.mall.query.EnterpriseQuery;

public interface EnterpriseMapper  {
	/***/
	Enterprise load(Long id);

	/***/
	void insert(Enterprise enterprise);

	/***/
	void update(Enterprise enterprise);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Enterprise> queryList(EnterpriseQuery enterpriseQuery);

	/***/
	int queryCount(EnterpriseQuery enterpriseQuery);
}