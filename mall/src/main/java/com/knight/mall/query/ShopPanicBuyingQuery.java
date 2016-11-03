package com.knight.mall.query;

import java.io.Serializable;
import java.util.Date;

import com.knight.mall.common.pageUtils.AbstractQueryParam;

/**
 * 查询对象
 */
public class ShopPanicBuyingQuery extends AbstractQueryParam implements Serializable {
	private static final long serialVersionUID = 14766324343691L;

	private Long[] idArray;// 主键id
	private Long pbId;// 抢购商品id
	private Long shopId;// 商铺id
	private Date gmtCreateFrom;// 创建时间
	private Date gmtCreateTo;// 创建时间
	private Date gmtModifyFrom;// 修改时间
	private Date gmtModifyTo;// 修改时间
	private Integer status;// 状态1:进行中2:停止
	private Integer[] statusArray;// 状态1:进行中2:停止
	private Date startTimeFrom;// 抢购开始时间(开始时间与结束时间最大为24小时)
	private Date startTimeTo;// 抢购开始时间(开始时间与结束时间最大为24小时)
	private Date endTimeFrom;// 抢购结束时间(开始时间与结束时间最大为24小时)
	private Date endTimeTo;// 抢购结束时间(开始时间与结束时间最大为24小时)
	private String pbName;// (抢购)活动名称

	/*** 主键id */
	public Long[] getIdArray() {
		return idArray;
	}

	/*** 主键id */
	public void setIdArray(Long... idArray) {
		this.idArray = idArray;
	}

	/*** 抢购商品id */
	public Long getPbId() {
		return pbId;
	}

	/*** 抢购商品id */
	public void setPbId(Long pbId) {
		this.pbId = pbId;
	}

	/*** 商铺id */
	public Long getShopId() {
		return shopId;
	}

	/*** 商铺id */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
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

	/*** 状态1:进行中2:停止 */
	public Integer getStatus() {
		return status;
	}

	/*** 状态1:进行中2:停止 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/*** 状态1:进行中2:停止 */
	public Integer[] getStatusArray() {
		return statusArray;
	}

	/*** 状态1:进行中2:停止 */
	public void setStatusArray(Integer... statusArray) {
		this.statusArray = statusArray;
	}

	/*** 抢购开始时间(开始时间与结束时间最大为24小时) */
	public Date getStartTimeFrom() {
		return startTimeFrom;
	}

	/*** 抢购开始时间(开始时间与结束时间最大为24小时) */
	public void setStartTimeFrom(Date startTimeFrom) {
		this.startTimeFrom = startTimeFrom;
	}

	/*** 抢购开始时间(开始时间与结束时间最大为24小时) */
	public Date getStartTimeTo() {
		return startTimeTo;
	}

	/*** 抢购开始时间(开始时间与结束时间最大为24小时) */
	public void setStartTimeTo(Date startTimeTo) {
		this.startTimeTo = startTimeTo;
	}

	/*** 抢购结束时间(开始时间与结束时间最大为24小时) */
	public Date getEndTimeFrom() {
		return endTimeFrom;
	}

	/*** 抢购结束时间(开始时间与结束时间最大为24小时) */
	public void setEndTimeFrom(Date endTimeFrom) {
		this.endTimeFrom = endTimeFrom;
	}

	/*** 抢购结束时间(开始时间与结束时间最大为24小时) */
	public Date getEndTimeTo() {
		return endTimeTo;
	}

	/*** 抢购结束时间(开始时间与结束时间最大为24小时) */
	public void setEndTimeTo(Date endTimeTo) {
		this.endTimeTo = endTimeTo;
	}

	/*** (抢购)活动名称 */
	public String getPbName() {
		return pbName;
	}

	/*** (抢购)活动名称 */
	public void setPbName(String pbName) {
		this.pbName = pbName;
	}
}
