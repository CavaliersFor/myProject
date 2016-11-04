package com.knight.mall.model;

import java.io.Serializable;

/**
 * 实体类
 */
public class TradeNoSequence implements Serializable {
	private static final long serialVersionUID = 14799222834922L;

	private Long tradeNo;//

	public TradeNoSequence() {
	}

	/***/
	public Long getTradeNo() {
		return tradeNo;
	}

	/***/
	public void setTradeNo(Long tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Override
	public String toString() {
		return "TradeNoSequence [ tradeNo=" + tradeNo + "]";
	}
}
