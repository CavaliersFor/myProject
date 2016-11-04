package com.knight.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 实体类
 */
public class Orders implements Serializable {
	private static final long serialVersionUID = 14773212195942L;

	private Long id;// 主键
	private Long tradeId;// 订单表id
	private Integer num;// 订单数量
	private Long productId;// 产品id
	private String productName;// 产品名称
	private BigDecimal productRealPrice;// 产品实际销售价格
	private String productPicPath;// 产品图片
	private BigDecimal totalPrice;// 总价格
	private BigDecimal totalRealPrice;// 实付
	private BigDecimal totalDiscountPrice;// 总的优惠价格
	private Date gmtCreate;// 创建时间
	private Date gmtModify;// 修改时间
	private Integer status;// 交易状态 可选值: 1:* TRADE_NO_CREATE_PAY(没有创建支付宝交易) *
							// 2:WAIT_BUYER_PAY(等待买家付款) 3
							// SELLER_CONSIGNED_PART(卖家部分发货) *
							// WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) *
							// WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) *
							// TRADE_BUYER_SIGNED(买家已签收,货到付款专用) *
							// TRADE_FINISHED(交易成功) * TRA
	private Integer refundStatus;// 退款状态。退款状态。可选值
									// WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意)
									// WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货)
									// WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货)
									// SELLER_REFUSE_BUYER(卖家拒绝退款) CLOSED(退款关闭)
									// SUCCESS(退款成功)
	private Long skuId;// SKU id
	private String properties;// sku的销售属性组合字符串(p1:v1;p2:v2)
	private String propertiesname;// sku组合字符串的值
	private Long pbpId;// (抢购)活动商品id

	public Orders() {
	}

	/**
	 *
	 * @param id
	 *            -- 主键
	 */
	public Orders(Long id) {
		this.id = id;
	}

	/** 主键 */
	public Long getId() {
		return id;
	}

	/** 主键 */
	public void setId(Long id) {
		this.id = id;
	}

	/** 订单表id */
	public Long getTradeId() {
		return tradeId;
	}

	/** 订单表id */
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	/** 订单数量 */
	public Integer getNum() {
		return num;
	}

	/** 订单数量 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/** 产品id */
	public Long getProductId() {
		return productId;
	}

	/** 产品id */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/** 产品名称 */
	public String getProductName() {
		return productName;
	}

	/** 产品名称 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/** 产品实际销售价格 */
	public BigDecimal getProductRealPrice() {
		return productRealPrice;
	}

	/** 产品实际销售价格 */
	public void setProductRealPrice(BigDecimal productRealPrice) {
		this.productRealPrice = productRealPrice;
	}

	/** 产品图片 */
	public String getProductPicPath() {
		return productPicPath;
	}

	/** 产品图片 */
	public void setProductPicPath(String productPicPath) {
		this.productPicPath = productPicPath;
	}

	/** 总价格 */
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	/** 总价格 */
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	/** 实付 */
	public BigDecimal getTotalRealPrice() {
		return totalRealPrice;
	}

	/** 实付 */
	public void setTotalRealPrice(BigDecimal totalRealPrice) {
		this.totalRealPrice = totalRealPrice;
	}

	/** 总的优惠价格 */
	public BigDecimal getTotalDiscountPrice() {
		return totalDiscountPrice;
	}

	/** 总的优惠价格 */
	public void setTotalDiscountPrice(BigDecimal totalDiscountPrice) {
		this.totalDiscountPrice = totalDiscountPrice;
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

	/**
	 * 交易状态 可选值: 1:* TRADE_NO_CREATE_PAY(没有创建支付宝交易) * 2:WAIT_BUYER_PAY(等待买家付款) 3
	 * SELLER_CONSIGNED_PART(卖家部分发货) * WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) *
	 * WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) *
	 * TRADE_BUYER_SIGNED(买家已签收,货到付款专用) * TRADE_FINISHED(交易成功) * TRA
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 交易状态 可选值: 1:* TRADE_NO_CREATE_PAY(没有创建支付宝交易) * 2:WAIT_BUYER_PAY(等待买家付款) 3
	 * SELLER_CONSIGNED_PART(卖家部分发货) * WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) *
	 * WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) *
	 * TRADE_BUYER_SIGNED(买家已签收,货到付款专用) * TRADE_FINISHED(交易成功) * TRA
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 退款状态。退款状态。可选值 WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意)
	 * WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货)
	 * WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款)
	 * CLOSED(退款关闭) SUCCESS(退款成功)
	 */
	public Integer getRefundStatus() {
		return refundStatus;
	}

	/**
	 * 退款状态。退款状态。可选值 WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意)
	 * WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货)
	 * WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款)
	 * CLOSED(退款关闭) SUCCESS(退款成功)
	 */
	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}

	/** SKU id */
	public Long getSkuId() {
		return skuId;
	}

	/** SKU id */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	/** sku的销售属性组合字符串(p1:v1;p2:v2) */
	public String getProperties() {
		return properties;
	}

	/** sku的销售属性组合字符串(p1:v1;p2:v2) */
	public void setProperties(String properties) {
		this.properties = properties;
	}

	/** sku组合字符串的值 */
	public String getPropertiesname() {
		return propertiesname;
	}

	/** sku组合字符串的值 */
	public void setPropertiesname(String propertiesname) {
		this.propertiesname = propertiesname;
	}

	/** (抢购)活动商品id */
	public Long getPbpId() {
		return pbpId;
	}

	/** (抢购)活动商品id */
	public void setPbpId(Long pbpId) {
		this.pbpId = pbpId;
	}

	@Override
	public String toString() {
		return "Orders [ id=" + id + ", tradeId=" + tradeId + ", num=" + num + ", productId=" + productId
				+ ", productName=" + productName + ", productRealPrice=" + productRealPrice + ", productPicPath="
				+ productPicPath + ", totalPrice=" + totalPrice + ", totalRealPrice=" + totalRealPrice
				+ ", totalDiscountPrice=" + totalDiscountPrice + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify
				+ ", status=" + status + ", refundStatus=" + refundStatus + ", skuId=" + skuId + ", properties="
				+ properties + ", propertiesname=" + propertiesname + ", pbpId=" + pbpId + "]";
	}
}
