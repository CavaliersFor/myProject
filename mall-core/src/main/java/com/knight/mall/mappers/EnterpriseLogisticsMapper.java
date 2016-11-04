package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.EnterpriseLogistics;
import com.knight.mall.query.EnterpriseLogisticsQuery;

public interface EnterpriseLogisticsMapper  {
	/***/
	EnterpriseLogistics load(Long id);

	/***/
	void insert(EnterpriseLogistics enterpriseLogistics);

	/***/
	void update(EnterpriseLogistics enterpriseLogistics);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<EnterpriseLogistics> queryList(EnterpriseLogisticsQuery enterpriseLogisticsQuery);

	/***/
	int queryCount(EnterpriseLogisticsQuery enterpriseLogisticsQuery);
}