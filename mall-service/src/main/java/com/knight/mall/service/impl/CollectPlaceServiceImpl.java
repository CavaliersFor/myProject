package com.knight.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knight.mall.common.pageUtils.PageResult;
import com.knight.mall.mappers.CollectPlaceMapper;
import com.knight.mall.model.CollectPlace;
import com.knight.mall.query.CollectPlaceQuery;
import com.knight.mall.service.CollectPlaceService;


@Service
public class CollectPlaceServiceImpl implements CollectPlaceService{
	
	@Autowired
	private CollectPlaceMapper collectPlaceMapper;
	
	public CollectPlace load(Long id){
		return collectPlaceMapper.load(id);
	}
	
	public List<CollectPlace>  queryList(CollectPlaceQuery collectPlaceQuery){
		return collectPlaceMapper.queryList(collectPlaceQuery);
	}


	@Override
	public Long add(CollectPlace t) {
		return collectPlaceMapper.insert(t);
	}


	@Override
	public int update(CollectPlace t) {
		return collectPlaceMapper.update(t);
	}


	@Override
	public int delete(Long id) {
		return collectPlaceMapper.delete(id);
	}


	@Override
	public int queryCount(CollectPlaceQuery q) {
		return collectPlaceMapper.queryCount(q);
	}
	
	/**
	 * 分页查询
	 * @param collectPlaceQuery
	 * @return
	 */
	public PageResult<CollectPlace> queryListForPage(CollectPlaceQuery collectPlaceQuery){
		List<CollectPlace> data = this.queryList(collectPlaceQuery);
		int count = this.queryCount(collectPlaceQuery);
		return PageResult.create(collectPlaceQuery, data, count);
	}
}
