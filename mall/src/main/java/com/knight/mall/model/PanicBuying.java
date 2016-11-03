package com.knight.mall.model;

import java.io.Serializable;
import java.util.Date;

/**
*实体类
*/
public class PanicBuying implements Serializable {
	private static final long serialVersionUID = 14763317428672L;

	
	
						private Long id;//主键id		
					private String name;//抢购名称(标题)		
					private Date gmtCreate;//创建时间		
					private Date gmtModify;//修改时间		
					private Integer status;//状态		
					private Date startTime;//抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00)		
					private Date endTime;//抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59)		
					private Long enterpriseId;//商家id		
		
		

		public PanicBuying() {}

		/**
	*
		 *@param id -- 主键id
		*/
	public PanicBuying(Long id) {
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
		/**抢购名称(标题)*/
	public String getName() {
		return name;
	}
	/**抢购名称(标题)*/
	public void setName(String name) {
		this.name = name;
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
		/**状态*/
	public Integer getStatus() {
		return status;
	}
	/**状态*/
	public void setStatus(Integer status) {
		this.status = status;
	}
		/**抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00)*/
	public Date getStartTime() {
		return startTime;
	}
	/**抢购起始时间(日期，时分秒都是00:00:00,例如2016-10-25 00:00:00)*/
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
		/**抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59)*/
	public Date getEndTime() {
		return endTime;
	}
	/**抢购结束时间(日期，时分秒为23:59:59,例如 2016-11-25 23:59:59)*/
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
		/**商家id*/
	public Long getEnterpriseId() {
		return enterpriseId;
	}
	/**商家id*/
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
		
	@Override
	public String toString() {
		return "PanicBuying [ id=" + id + ", name=" + name + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify + ", status=" + status + ", startTime=" + startTime + ", endTime=" + endTime + ", enterpriseId=" + enterpriseId + "]";
	}
}
