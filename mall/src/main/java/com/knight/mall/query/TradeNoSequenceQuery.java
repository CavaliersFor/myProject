package com.knight.mall.query;

import java.io.Serializable;

import com.knight.mall.common.pageUtils.AbstractQueryParam;

/**
 * 查询对象
 */
public class TradeNoSequenceQuery extends AbstractQueryParam implements Serializable {
	private static final long serialVersionUID = 14799222834921L;

	private Long tradeNo;//

	/****/
	public Long getTradeNo() {
		return tradeNo;
	}

	/****/
	public void setTradeNo(Long tradeNo) {
		this.tradeNo = tradeNo;
	}
}
