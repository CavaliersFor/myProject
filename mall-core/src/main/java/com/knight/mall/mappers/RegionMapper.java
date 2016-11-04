package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.Region;
import com.knight.mall.query.RegionQuery;

public interface RegionMapper  {
	/***/
	Region load(String id);

	/***/
	Long insert(Region region);

	/***/
	int update(Region region);

	/***/
	int updateStatus(@Param("id") String id, @Param("status") Serializable status);

	/***/
	int delete(String id);

	/***/
	List<Region> queryList(RegionQuery regionQuery);

	/***/
	int queryCount(RegionQuery regionQuery);
	
	
	String getParentCode(String code);
}