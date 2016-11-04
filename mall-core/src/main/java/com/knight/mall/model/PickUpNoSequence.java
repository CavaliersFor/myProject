package com.knight.mall.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 */
public class PickUpNoSequence implements Serializable {
	private static final long serialVersionUID = 14771446903242L;

	private Long pickUpNo;//

	public PickUpNoSequence() {
	}

	/***/
	public Long getPickUpNo() {
		return pickUpNo;
	}

	/***/
	public void setPickUpNo(Long pickUpNo) {
		this.pickUpNo = pickUpNo;
	}

	@Override
	public String toString() {
		return "PickUpNoSequence [ pickUpNo=" + pickUpNo + "]";
	}
}
