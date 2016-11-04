package com.knight.mall.service;

import java.util.List;

public interface CommonService<T,Q> {
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	T load(Long id);

	/**
	 * 新增信息
	 * @param discount
	 * @return
	 * @throws ServiceException 
	 */
	Long add(T t);

	/**
	 * 更新信息
	 * @param discount
	 */
	int update(T t);

	/**
	 * 物理删除数据
	 * */
	int delete(Long id);

	/**
	 * 查询信息
	 * @param discountQuery
	 * @return
	 */
	List<T> queryList(Q q);

	/**
	 * 根据条件获得总数
	 * @param discountQuery
	 * @return
	 */
	int queryCount(Q q);
}

