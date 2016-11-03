package com.knight.mall.model;

import java.io.Serializable;
import java.util.Date;

/**
*实体类
*/
public class ShopPanicBuying implements Serializable {
	private static final long serialVersionUID = 14766324343692L;

	
	
						private Long id;//主键id		
					private Long pbId;//抢购商品id		
					private Long shopId;//商铺id		
					private Date gmtCreate;//创建时间		
					private Date gmtModify;//修改时间		
					private Integer status;//状态1:进行中2:停止		
					private Date startTime;//抢购开始时间(开始时间与结束时间最大为24小时)		
					private Date endTime;//抢购结束时间(开始时间与结束时间最大为24小时)		
					private String pbName;//(抢购)活动名称		
		
		

		public ShopPanicBuying() {}

		/**
	*
		 *@param id -- 主键id
		*/
	public ShopPanicBuying(Long id) {
					this.id = id;
			}

			/**主键id*/
	public Long getId() {
		return id;
	}
	/**主键id*/
	public void setId(Long id) {
		this.id = id;
	}
		/**抢购商品id*/
	public Long getPbId() {
		return pbId;
	}
	/**抢购商品id*/
	public void setPbId(Long pbId) {
		this.pbId = pbId;
	}
		/**商铺id*/
	public Long getShopId() {
		return shopId;
	}
	/**商铺id*/
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
		/**创建时间*/
	public Date getGmtCreate() {
		return gmtCreate;
	}
	/**创建时间*/
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
		/**修改时间*/
	public Date getGmtModify() {
		return gmtModify;
	}
	/**修改时间*/
	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}
		/**状态1:进行中2:停止*/
	public Integer getStatus() {
		return status;
	}
	/**状态1:进行中2:停止*/
	public void setStatus(Integer status) {
		this.status = status;
	}
		/**抢购开始时间(开始时间与结束时间最大为24小时)*/
	public Date getStartTime() {
		return startTime;
	}
	/**抢购开始时间(开始时间与结束时间最大为24小时)*/
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
		/**抢购结束时间(开始时间与结束时间最大为24小时)*/
	public Date getEndTime() {
		return endTime;
	}
	/**抢购结束时间(开始时间与结束时间最大为24小时)*/
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
		/**(抢购)活动名称*/
	public String getPbName() {
		return pbName;
	}
	/**(抢购)活动名称*/
	public void setPbName(String pbName) {
		this.pbName = pbName;
	}
		
	@Override
	public String toString() {
		return "ShopPanicBuying [ id=" + id + ", pbId=" + pbId + ", shopId=" + shopId + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify + ", status=" + status + ", startTime=" + startTime + ", endTime=" + endTime + ", pbName=" + pbName + "]";
	}
}
