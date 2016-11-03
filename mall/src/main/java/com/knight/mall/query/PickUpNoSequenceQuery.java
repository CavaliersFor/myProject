package com.knight.mall.query;

import java.io.Serializable;

import com.knight.mall.common.pageUtils.AbstractQueryParam;

/**
 * 查询对象
 */
public class PickUpNoSequenceQuery extends AbstractQueryParam implements Serializable {
	private static final long serialVersionUID = 14771446903241L;

	private Long pickUpNo;//

	/****/
	public Long getPickUpNo() {
		return pickUpNo;
	}

	/****/
	public void setPickUpNo(Long pickUpNo) {
		this.pickUpNo = pickUpNo;
	}
}
