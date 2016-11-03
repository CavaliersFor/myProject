package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.LogisticsCompany;
import com.knight.mall.query.LogisticsCompanyQuery;

public interface LogisticsCompanyMapper  {
	/***/
	LogisticsCompany load(Long id);

	/***/
	void insert(LogisticsCompany logisticsCompany);

	/***/
	void update(LogisticsCompany logisticsCompany);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<LogisticsCompany> queryList(LogisticsCompanyQuery logisticsCompanyQuery);

	/***/
	int queryCount(LogisticsCompanyQuery logisticsCompanyQuery);
}