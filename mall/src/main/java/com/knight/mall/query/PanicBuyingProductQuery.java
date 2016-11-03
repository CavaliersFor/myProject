package com.knight.mall.query;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.knight.mall.common.pageUtils.AbstractQueryParam;

/**
 * 查询对象
 */
public class PanicBuyingProductQuery extends AbstractQueryParam implements Serializable {
	private static final long serialVersionUID = 14778350873111L;

	private Long[] idArray;// 主键id
	private Date gmtCreateFrom;// 创建时间
	private Date gmtCreateTo;// 创建时间
	private Date gmtModifyFrom;// 修改时间
	private Date gmtModifyTo;// 修改时间
	private Long productId;// 商品id
	private Integer num;// 抢购数量
	private Integer status;// 状态1：抢购中2：抢购完
	private Integer[] statusArray;// 状态1：抢购中2：抢购完
	private String supportArea;// 适用地区(全部支持就选择 全部,多个地区用,隔开)
	private BigDecimal postageFrom;// 邮费
	private BigDecimal postageTo;// 邮费
	private Integer saleNum;// 销量
	private Long pbId;// 抢购表id
	private BigDecimal priceFrom;// 售价
	private BigDecimal priceTo;// 售价

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

	/*** 商品id */
	public Long getProductId() {
		return productId;
	}

	/*** 商品id */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/*** 抢购数量 */
	public Integer getNum() {
		return num;
	}

	/*** 抢购数量 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/*** 状态1：抢购中2：抢购完 */
	public Integer getStatus() {
		return status;
	}

	/*** 状态1：抢购中2：抢购完 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/*** 状态1：抢购中2：抢购完 */
	public Integer[] getStatusArray() {
		return statusArray;
	}

	/*** 状态1：抢购中2：抢购完 */
	public void setStatusArray(Integer... statusArray) {
		this.statusArray = statusArray;
	}

	/*** 适用地区(全部支持就选择 全部,多个地区用,隔开) */
	public String getSupportArea() {
		return supportArea;
	}

	/*** 适用地区(全部支持就选择 全部,多个地区用,隔开) */
	public void setSupportArea(String supportArea) {
		this.supportArea = supportArea;
	}

	/*** 邮费 */
	public BigDecimal getPostageFrom() {
		return postageFrom;
	}

	/*** 邮费 */
	public void setPostageFrom(BigDecimal postageFrom) {
		this.postageFrom = postageFrom;
	}

	/*** 邮费 */
	public BigDecimal getPostageTo() {
		return postageTo;
	}

	/*** 邮费 */
	public void setPostageTo(BigDecimal postageTo) {
		this.postageTo = postageTo;
	}

	/*** 销量 */
	public Integer getSaleNum() {
		return saleNum;
	}

	/*** 销量 */
	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}

	/*** 抢购表id */
	public Long getPbId() {
		return pbId;
	}

	/*** 抢购表id */
	public void setPbId(Long pbId) {
		this.pbId = pbId;
	}

	/*** 售价 */
	public BigDecimal getPriceFrom() {
		return priceFrom;
	}

	/*** 售价 */
	public void setPriceFrom(BigDecimal priceFrom) {
		this.priceFrom = priceFrom;
	}

	/*** 售价 */
	public BigDecimal getPriceTo() {
		return priceTo;
	}

	/*** 售价 */
	public void setPriceTo(BigDecimal priceTo) {
		this.priceTo = priceTo;
	}
}
