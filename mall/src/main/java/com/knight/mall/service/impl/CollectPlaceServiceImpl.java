package com.knight.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knight.mall.mappers.CollectPlaceMapper;
import com.knight.mall.model.CollectPlace;
import com.knight.mall.service.CollectPlaceService;


@Service
public class CollectPlaceServiceImpl implements CollectPlaceService{
	
	@Autowired
	private CollectPlaceMapper collectPlaceMapper;
	
	public CollectPlace load(Long id){
		return collectPlaceMapper.load(id);
	}
	
}
