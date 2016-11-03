package com.knight.mall.query;

import java.io.Serializable;
import java.util.Date;

import com.knight.mall.common.pageUtils.AbstractQueryParam;

/**
 * 查询对象
 */
public class PanicBuyingQuery extends AbstractQueryParam implements Serializable {
	private static final long serialVersionUID = 14763317428671L;

	private Long[] idArray;// 主键id
	private String name;// 抢购名称(标题)
	private Date gmtCreateFrom;// 创建时间
	private Date gmtCreateTo;// 创建时间
	private Date gmtModifyFrom;// 修改时间
	private Date gmtModifyTo;// 修改时间
	private Integer status;// 状态
	private Integer[] statusArray;// 状态
	private Date startTimeFrom;// 抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00)
	private Date startTimeTo;// 抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00)
	private Date endTimeFrom;// 抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59)
	private Date endTimeTo;// 抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59)
	private Long enterpriseId;// 商家id

	/*** 主键id */
	public Long[] getIdArray() {
		return idArray;
	}

	/*** 主键id */
	public void setIdArray(Long... idArray) {
		this.idArray = idArray;
	}

	/*** 抢购名称(标题) */
	public String getName() {
		return name;
	}

	/*** 抢购名称(标题) */
	public void setName(String name) {
		this.name = name;
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

	/*** 状态 */
	public Integer getStatus() {
		return status;
	}

	/*** 状态 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/*** 状态 */
	public Integer[] getStatusArray() {
		return statusArray;
	}

	/*** 状态 */
	public void setStatusArray(Integer... statusArray) {
		this.statusArray = statusArray;
	}

	/*** 抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00) */
	public Date getStartTimeFrom() {
		return startTimeFrom;
	}

	/*** 抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00) */
	public void setStartTimeFrom(Date startTimeFrom) {
		this.startTimeFrom = startTimeFrom;
	}

	/*** 抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00) */
	public Date getStartTimeTo() {
		return startTimeTo;
	}

	/*** 抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00) */
	public void setStartTimeTo(Date startTimeTo) {
		this.startTimeTo = startTimeTo;
	}

	/*** 抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59) */
	public Date getEndTimeFrom() {
		return endTimeFrom;
	}

	/*** 抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59) */
	public void setEndTimeFrom(Date endTimeFrom) {
		this.endTimeFrom = endTimeFrom;
	}

	/*** 抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59) */
	public Date getEndTimeTo() {
		return endTimeTo;
	}

	/*** 抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59) */
	public void setEndTimeTo(Date endTimeTo) {
		this.endTimeTo = endTimeTo;
	}

	/*** 商家id */
	public Long getEnterpriseId() {
		return enterpriseId;
	}

	/*** 商家id */
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
}
