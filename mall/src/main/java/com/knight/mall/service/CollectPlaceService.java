package com.knight.mall.service;

import com.knight.mall.common.pageUtils.PageResult;
import com.knight.mall.model.CollectPlace;
import com.knight.mall.query.CollectPlaceQuery;

public interface CollectPlaceService extends CommonService<CollectPlace, CollectPlaceQuery>{
	
	/**
	 * 分页查询
	 * @param collectPlaceQuery
	 * @return
	 */
	public PageResult<CollectPlace> queryListForPage(CollectPlaceQuery collectPlaceQuery);
}
