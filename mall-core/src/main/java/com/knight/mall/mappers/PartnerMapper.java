package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Partner;
import com.knight.mall.query.PartnerQuery;

public interface PartnerMapper  {
	/***/
	Partner load(Long id);

	/***/
	void insert(Partner partner);

	/***/
	void update(Partner partner);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Partner> queryList(PartnerQuery partnerQuery);

	/***/
	int queryCount(PartnerQuery partnerQuery);
}