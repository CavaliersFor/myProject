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
	void insert(CollectPlace collectPlace);

	/***/
	void update(CollectPlace collectPlace);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<CollectPlace> queryList(CollectPlaceQuery collectPlaceQuery);

	/***/
	int queryCount(CollectPlaceQuery collectPlaceQuery);
}