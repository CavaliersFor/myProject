package com.knight.test.servuce;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.knight.mall.service.CollectPlaceService;
import com.knight.test.support.TestSupport;

public class CollectPlaceServiceImplTest extends TestSupport{
		
	@Autowired
	private CollectPlaceService collectPlaceService;
	
	@Test
	public void testLoad(){
		System.out.println(collectPlaceService.load(1L));
	}
}
