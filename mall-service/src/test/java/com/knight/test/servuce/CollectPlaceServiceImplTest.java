package com.knight.test.servuce;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.knight.mall.query.CollectPlaceQuery;
import com.knight.mall.service.CollectPlaceService;
import com.knight.test.support.TestSupport;

public class CollectPlaceServiceImplTest extends TestSupport{
		
	@Autowired
	private CollectPlaceService collectPlaceService;
	
	@Test
	public void testLoad(){
		System.out.println(collectPlaceService.load(1L));
	}
	
	@Test
	public void queryListForPageTest(){
		CollectPlaceQuery collectPlaceQuery = new CollectPlaceQuery();
		collectPlaceQuery.setPageSize(10);
		System.out.println(collectPlaceService.queryListForPage(collectPlaceQuery));
	}
}
