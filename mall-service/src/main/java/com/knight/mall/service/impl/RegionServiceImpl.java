package com.knight.mall.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knight.mall.common.pageUtils.PageResult;
import com.knight.mall.constant.Constant;
import com.knight.mall.exception.ServiceException;
import com.knight.mall.mappers.RegionMapper;
import com.knight.mall.model.Region;
import com.knight.mall.query.RegionQuery;
import com.knight.mall.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService {
	
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(RegionServiceImpl.class);
	
	@Autowired
	private RegionMapper regionMapper;

	@Override
	public Region load(Long id) {
		return regionMapper.load(id.toString());
	}

	@Override
	public Long add(Region t) {
		return regionMapper.insert(t);
	}

	@Override
	public int update(Region t) {
		return regionMapper.update(t);
	}

	@Override
	public int delete(Long id) {
		return regionMapper.delete(id.toString());
	}

	@Override
	public List<Region> queryList(RegionQuery q) {
		return regionMapper.queryList(q);
	}

	@Override
	public int queryCount(RegionQuery q) {
		return regionMapper.queryCount(q);
	}

	@Override
	public PageResult<Region> queryListForPage(RegionQuery query) {
		List<Region> data = this.queryList(query);
		int count = this.queryCount(query);
		return PageResult.create(query, data, count);
	}
	
	
	@Override
	public List<Region> getByParentCode(String parentCode) throws ServiceException {
		if (StringUtils.isBlank(parentCode)) {
			throw new ServiceException("数据错误");
		}
		RegionQuery query = new RegionQuery();
		query.setParentCode(parentCode);
		return regionMapper.queryList(query);
	}

	@Override
	public Region getByCode(String code) throws ServiceException {
		if (StringUtils.isBlank(code)) {
			throw new ServiceException("数据错误");
		}
		return regionMapper.load(code);
	}

	@Override
	public List<Region> getAllProvince() {
		RegionQuery query = new RegionQuery();
		query.setRegionType(Constant.REGION.REGIONTYPE.PROVINCE);
		return regionMapper.queryList(query);
	}

	@Override
	public List<Region> getByParentCodeForTree(String rootCode, Integer level) throws ServiceException {
		if (StringUtils.isBlank(rootCode)) {
			logger.error("省份编号为空");
			throw new ServiceException("数据错误");
		}
		if (level == null) {
			logger.error("查询级别为空");
			throw new ServiceException("数据错误");
		}
		RegionQuery query = new RegionQuery();
		query.setParentCode(rootCode);
		query.setRegionType(level);
		return regionMapper.queryList(query);
	}

	@Override
	public String getParentCode(String code) throws ServiceException {
		if (StringUtils.isBlank(code)) {
			logger.error("省份编号为空");
			throw new ServiceException("数据错误");
		}
		return regionMapper.getParentCode(code);
	}

}
