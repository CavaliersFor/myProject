package com.knight.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 实体类
 */
public class CollectPlace implements Serializable {
	private static final long serialVersionUID = 14762231066652L;

	private Long id;// 主键id
	private Date gmtCreate;// 创建时间
	private Date gmtModify;// 修改时间
	private Integer clpStatus;// 状态1：使用中 2：停止使用
	private String clpName;// 领取点名称
	private String clpAddress;// 领取点详细地址
	private String clpTelephone;// 领取点联系电话
	private Long enterpriseId;// 商家id
	private Integer collectTime;// 多少时间能取货单位小时，0就是可以及时取货
	private BigDecimal fee;// 自提费用

	public CollectPlace() {
	}

	/**
	 *
	 * @param id
	 *            -- 主键id
	 */
	public CollectPlace(Long id) {
		this.id = id;
	}

	/** 主键id */
	public Long getId() {
		return id;
	}

	/** 主键id */
	public void setId(Long id) {
		this.id = id;
	}

	/** 创建时间 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/** 创建时间 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/** 修改时间 */
	public Date getGmtModify() {
		return gmtModify;
	}

	/** 修改时间 */
	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}

	/** 状态1：使用中 2：停止使用 */
	public Integer getClpStatus() {
		return clpStatus;
	}

	/** 状态1：使用中 2：停止使用 */
	public void setClpStatus(Integer clpStatus) {
		this.clpStatus = clpStatus;
	}

	/** 领取点名称 */
	public String getClpName() {
		return clpName;
	}

	/** 领取点名称 */
	public void setClpName(String clpName) {
		this.clpName = clpName;
	}

	/** 领取点详细地址 */
	public String getClpAddress() {
		return clpAddress;
	}

	/** 领取点详细地址 */
	public void setClpAddress(String clpAddress) {
		this.clpAddress = clpAddress;
	}

	/** 领取点联系电话 */
	public String getClpTelephone() {
		return clpTelephone;
	}

	/** 领取点联系电话 */
	public void setClpTelephone(String clpTelephone) {
		this.clpTelephone = clpTelephone;
	}

	/** 商家id */
	public Long getEnterpriseId() {
		return enterpriseId;
	}

	/** 商家id */
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	/** 多少时间能取货单位小时，0就是可以及时取货 */
	public Integer getCollectTime() {
		return collectTime;
	}

	/** 多少时间能取货单位小时，0就是可以及时取货 */
	public void setCollectTime(Integer collectTime) {
		this.collectTime = collectTime;
	}

	/** 自提费用 */
	public BigDecimal getFee() {
		return fee;
	}

	/** 自提费用 */
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "CollectPlace [ id=" + id + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify + ", clpStatus="
				+ clpStatus + ", clpName=" + clpName + ", clpAddress=" + clpAddress + ", clpTelephone=" + clpTelephone
				+ ", enterpriseId=" + enterpriseId + ", collectTime=" + collectTime + ", fee=" + fee + "]";
	}
}
