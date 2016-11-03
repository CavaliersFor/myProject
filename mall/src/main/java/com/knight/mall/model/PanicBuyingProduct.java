package com.knight.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 实体类
 */
public class PanicBuyingProduct implements Serializable {
	private static final long serialVersionUID = 14778350873112L;

	private Long id;// 主键id
	private Date gmtCreate;// 创建时间
	private Date gmtModify;// 修改时间
	private Long productId;// 商品id
	private Integer num;// 抢购数量
	private Integer status;// 状态1：抢购中2：抢购完
	private String supportArea;// 适用地区(全部支持就选择 全部,多个地区用,隔开)
	private BigDecimal postage;// 邮费
	private Integer saleNum;// 销量
	private Long pbId;// 抢购表id
	private BigDecimal price;// 售价

	public PanicBuyingProduct() {
	}

	/**
	 *
	 * @param id
	 *            -- 主键id
	 */
	public PanicBuyingProduct(Long id) {
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

	/** 商品id */
	public Long getProductId() {
		return productId;
	}

	/** 商品id */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/** 抢购数量 */
	public Integer getNum() {
		return num;
	}

	/** 抢购数量 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/** 状态1：抢购中2：抢购完 */
	public Integer getStatus() {
		return status;
	}

	/** 状态1：抢购中2：抢购完 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/** 适用地区(全部支持就选择 全部,多个地区用,隔开) */
	public String getSupportArea() {
		return supportArea;
	}

	/** 适用地区(全部支持就选择 全部,多个地区用,隔开) */
	public void setSupportArea(String supportArea) {
		this.supportArea = supportArea;
	}

	/** 邮费 */
	public BigDecimal getPostage() {
		return postage;
	}

	/** 邮费 */
	public void setPostage(BigDecimal postage) {
		this.postage = postage;
	}

	/** 销量 */
	public Integer getSaleNum() {
		return saleNum;
	}

	/** 销量 */
	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}

	/** 抢购表id */
	public Long getPbId() {
		return pbId;
	}

	/** 抢购表id */
	public void setPbId(Long pbId) {
		this.pbId = pbId;
	}

	/** 售价 */
	public BigDecimal getPrice() {
		return price;
	}

	/** 售价 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PanicBuyingProduct [ id=" + id + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify
				+ ", productId=" + productId + ", num=" + num + ", status=" + status + ", supportArea=" + supportArea
				+ ", postage=" + postage + ", saleNum=" + saleNum + ", pbId=" + pbId + ", price=" + price + "]";
	}
}
