package com.knight.mall.service;

import java.util.List;

import com.knight.mall.common.pageUtils.PageResult;
import com.knight.mall.exception.ServiceException;
import com.knight.mall.model.Region;
import com.knight.mall.query.RegionQuery;

public interface RegionService extends CommonService<Region,RegionQuery>{
	
	/**
	 * 查询带有分页的
	 * @param query
	 * @return
	 */
	public PageResult<Region> queryListForPage(RegionQuery query); 
	
	
	
	/**
	 * 根据parentCode获取下级地区
	 *2016年8月17日下午7:20:35
	 * @param parentCode
	 * @return
	 * @throws ServiceException 
	 */
	List<Region> getByParentCode(String parentCode) throws ServiceException;

	/**
	 * 根据code获取地区名称
	 *2016年8月17日下午7:20:19
	 * @param code
	 * @return
	 * @throws ServiceException 
	 */
	Region getByCode(String code) throws ServiceException;

	/**
	 * 获取所有的省
	 *2016年8月17日下午7:17:50
	 * @return
	 */
	List<Region> getAllProvince();

	/**
	 * 根据根code获取第几级城市列表 1：国家2：省份3：城市4：区县
	 *2016年8月17日下午7:18:31
	 * @param rootCode
	 * @param level
	 * @return
	 * @throws ServiceException s
	 */
	List<Region> getByParentCodeForTree(String rootCode, Integer level) throws ServiceException;

	/**
	 * 根据code获取父级code
	 *2016年8月17日下午7:20:58
	 * @param code
	 * @return
	 * @throws ServiceException 
	 */
	String getParentCode(String code) throws ServiceException;
}
