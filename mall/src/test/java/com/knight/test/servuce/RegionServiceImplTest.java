package com.knight.test.servuce;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.knight.mall.common.pageUtils.PageResult;
import com.knight.mall.model.Region;
import com.knight.mall.query.RegionQuery;
import com.knight.mall.service.RegionService;
import com.knight.test.support.TestSupport;

public class RegionServiceImplTest extends TestSupport{
	
	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(RegionServiceImplTest.class);
	
	@Autowired
	private RegionService regionService;
	
	@Test
	public void queryListForPageTest(){
		RegionQuery query = new RegionQuery();
		query.setPageSize(10);
		PageResult<Region> list= regionService.queryListForPage(query);
		logger.debug("数据={}",list);
	}
}
