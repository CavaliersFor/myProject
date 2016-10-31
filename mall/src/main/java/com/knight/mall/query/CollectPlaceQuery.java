package com.knight.mall.query;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 查询对象
 */
public class CollectPlaceQuery implements Serializable {
	private static final long serialVersionUID = 14762231066651L;

	private Long[] idArray;// 主键id
	private Date gmtCreateFrom;// 创建时间
	private Date gmtCreateTo;// 创建时间
	private Date gmtModifyFrom;// 修改时间
	private Date gmtModifyTo;// 修改时间
	private Integer clpStatus;// 状态1：使用中 2：停止使用
	private String clpName;// 领取点名称
	private String clpAddress;// 领取点详细地址
	private String clpTelephone;// 领取点联系电话
	private Long enterpriseId;// 商家id
	private Integer collectTime;// 多少时间能取货单位小时，0就是可以及时取货
	private BigDecimal feeFrom;// 自提费用
	private BigDecimal feeTo;// 自提费用

	/*** 主键id */
	public Long[] getIdArray() {
		return idArray;
	}

	/*** 主键id */
	public void setIdArray(Long... idArray) {
		this.idArray = idArray;
	}

	/*** 创建时间 */
	public Date getGmtCreateFrom() {
		return gmtCreateFrom;
	}

	/*** 创建时间 */
	public void setGmtCreateFrom(Date gmtCreateFrom) {
		this.gmtCreateFrom = gmtCreateFrom;
	}

	/*** 创建时间 */
	public Date getGmtCreateTo() {
		return gmtCreateTo;
	}

	/*** 创建时间 */
	public void setGmtCreateTo(Date gmtCreateTo) {
		this.gmtCreateTo = gmtCreateTo;
	}

	/*** 修改时间 */
	public Date getGmtModifyFrom() {
		return gmtModifyFrom;
	}

	/*** 修改时间 */
	public void setGmtModifyFrom(Date gmtModifyFrom) {
		this.gmtModifyFrom = gmtModifyFrom;
	}

	/*** 修改时间 */
	public Date getGmtModifyTo() {
		return gmtModifyTo;
	}

	/*** 修改时间 */
	public void setGmtModifyTo(Date gmtModifyTo) {
		this.gmtModifyTo = gmtModifyTo;
	}

	/*** 状态1：使用中 2：停止使用 */
	public Integer getClpStatus() {
		return clpStatus;
	}

	/*** 状态1：使用中 2：停止使用 */
	public void setClpStatus(Integer clpStatus) {
		this.clpStatus = clpStatus;
	}

	/*** 领取点名称 */
	public String getClpName() {
		return clpName;
	}

	/*** 领取点名称 */
	public void setClpName(String clpName) {
		this.clpName = clpName;
	}

	/*** 领取点详细地址 */
	public String getClpAddress() {
		return clpAddress;
	}

	/*** 领取点详细地址 */
	public void setClpAddress(String clpAddress) {
		this.clpAddress = clpAddress;
	}

	/*** 领取点联系电话 */
	public String getClpTelephone() {
		return clpTelephone;
	}

	/*** 领取点联系电话 */
	public void setClpTelephone(String clpTelephone) {
		this.clpTelephone = clpTelephone;
	}

	/*** 商家id */
	public Long getEnterpriseId() {
		return enterpriseId;
	}

	/*** 商家id */
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	/*** 多少时间能取货单位小时，0就是可以及时取货 */
	public Integer getCollectTime() {
		return collectTime;
	}

	/*** 多少时间能取货单位小时，0就是可以及时取货 */
	public void setCollectTime(Integer collectTime) {
		this.collectTime = collectTime;
	}

	/*** 自提费用 */
	public BigDecimal getFeeFrom() {
		return feeFrom;
	}

	/*** 自提费用 */
	public void setFeeFrom(BigDecimal feeFrom) {
		this.feeFrom = feeFrom;
	}

	/*** 自提费用 */
	public BigDecimal getFeeTo() {
		return feeTo;
	}

	/*** 自提费用 */
	public void setFeeTo(BigDecimal feeTo) {
		this.feeTo = feeTo;
	}
}
