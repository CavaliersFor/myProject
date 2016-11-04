package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Category;
import com.knight.mall.query.CategoryQuery;

public interface CategoryMapper  {
	/***/
	Category load(Long id);

	/***/
	void insert(Category category);

	/***/
	void update(Category category);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<Category> queryList(CategoryQuery categoryQuery);

	/***/
	int queryCount(CategoryQuery categoryQuery);
}