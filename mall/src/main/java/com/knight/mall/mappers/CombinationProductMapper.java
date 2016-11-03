package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.CombinationProduct;
import com.knight.mall.query.CombinationProductQuery;

public interface CombinationProductMapper  {
	/***/
	CombinationProduct load(Long id);

	/***/
	void insert(CombinationProduct combinationProduct);

	/***/
	void update(CombinationProduct combinationProduct);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<CombinationProduct> queryList(CombinationProductQuery combinationProductQuery);

	/***/
	int queryCount(CombinationProductQuery combinationProductQuery);
}