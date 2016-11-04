package com.knight.mall.model;

import java.io.Serializable;

/**
 * 实体类
 */
public class OutTradeNoSequence implements Serializable {
	private static final long serialVersionUID = 14788085460872L;

	private Long outTradeNo;//

	public OutTradeNoSequence() {
	}

	/***/
	public Long getOutTradeNo() {
		return outTradeNo;
	}

	/***/
	public void setOutTradeNo(Long outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	@Override
	public String toString() {
		return "OutTradeNoSequence [ outTradeNo=" + outTradeNo + "]";
	}
}
