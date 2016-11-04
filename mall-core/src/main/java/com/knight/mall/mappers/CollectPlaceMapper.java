package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.CollectPlace;
import com.knight.mall.query.CollectPlaceQuery;

public interface CollectPlaceMapper  {
	/***/
	CollectPlace load(Long id);

	/***/
	Long insert(CollectPlace collectPlace);

	/***/
	int update(CollectPlace collectPlace);

	/***/
	int updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	int delete(Long id);

	/***/
	List<CollectPlace> queryList(CollectPlaceQuery collectPlaceQuery);

	/***/
	int queryCount(CollectPlaceQuery collectPlaceQuery);
}