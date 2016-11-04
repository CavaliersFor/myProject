package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Express;
import com.knight.mall.query.ExpressQuery;

public interface ExpressMapper  {
	/***/
	Express load(Long id);

	/***/
	void insert(Express express);

	/***/
	void update(Express express);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Express> queryList(ExpressQuery expressQuery);

	/***/
	int queryCount(ExpressQuery expressQuery);
}