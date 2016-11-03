package com.knight.mall.query;

import java.io.Serializable;

import com.knight.mall.common.pageUtils.AbstractQueryParam;

/**
 * 查询对象
 */
public class OutTradeNoSequenceQuery extends AbstractQueryParam implements Serializable {
	private static final long serialVersionUID = 14788085460871L;

	private Long outTradeNo;//

	/****/
	public Long getOutTradeNo() {
		return outTradeNo;
	}

	/****/
	public void setOutTradeNo(Long outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
}
