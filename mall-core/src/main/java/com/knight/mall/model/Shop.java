package com.knight.mall.model;

import java.io.Serializable;
import java.util.Date;

/**
*实体类
*/
public class Shop implements Serializable {
	private static final long serialVersionUID = 14787146246442L;

	
	
						private Long id;//主键id		
					private Date gmtCreate;//创建时间		
					private Date gmtModify;//修改时间		
					private Integer status;//状态1:正常 2:停止3:删除		
					private Long saleId;//卖家id		
					private Long partnerId;//合作者平台id		
					private String shopName;//店铺名称		
					private String accessKey;//接入者key		
					private String secretKey;//接入者秘钥		
					private String url;//访问地址		
					private String headPicUrl;//商铺头像图片		
					private String wxUrl;//微信获取openId地址		
					private String thirdUrl;//第三方校验地址		
					private Integer paymentMode;//支付方式1：支付宝支付(网页加支付宝钱包)2：微信支付3:支付宝网页支付		
					private Integer showBootIndex;//是否显示底部工具栏的首页 1:显示(默认)2:不显示		
					private Integer showBootCategory;//是否显示底部工具栏的自定义类目 1:显示(默认)2:不显示		
					private Integer showBootCart;//是否显示底部工具栏的购物车 1:显示(默认)2:不显示		
					private Integer showBootCenter;//是否显示底部工具栏的个人中心 1:显示(默认)2:不显示		
					private String indexUrl;//首页地址(内部访问)		
		
		

		public Shop() {}

		/**
	*
		 *@param id -- 主键id
		*/
	public Shop(Long id) {
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
		/**状态1:正常 2:停止3:删除*/
	public Integer getStatus() {
		return status;
	}
	/**状态1:正常 2:停止3:删除*/
	public void setStatus(Integer status) {
		this.status = status;
	}
		/**卖家id*/
	public Long getSaleId() {
		return saleId;
	}
	/**卖家id*/
	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}
		/**合作者平台id*/
	public Long getPartnerId() {
		return partnerId;
	}
	/**合作者平台id*/
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}
		/**店铺名称*/
	public String getShopName() {
		return shopName;
	}
	/**店铺名称*/
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
		/**接入者key*/
	public String getAccessKey() {
		return accessKey;
	}
	/**接入者key*/
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
		/**接入者秘钥*/
	public String getSecretKey() {
		return secretKey;
	}
	/**接入者秘钥*/
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
		/**访问地址*/
	public String getUrl() {
		return url;
	}
	/**访问地址*/
	public void setUrl(String url) {
		this.url = url;
	}
		/**商铺头像图片*/
	public String getHeadPicUrl() {
		return headPicUrl;
	}
	/**商铺头像图片*/
	public void setHeadPicUrl(String headPicUrl) {
		this.headPicUrl = headPicUrl;
	}
		/**微信获取openId地址*/
	public String getWxUrl() {
		return wxUrl;
	}
	/**微信获取openId地址*/
	public void setWxUrl(String wxUrl) {
		this.wxUrl = wxUrl;
	}
		/**第三方校验地址*/
	public String getThirdUrl() {
		return thirdUrl;
	}
	/**第三方校验地址*/
	public void setThirdUrl(String thirdUrl) {
		this.thirdUrl = thirdUrl;
	}
		/**支付方式1：支付宝支付(网页加支付宝钱包)2：微信支付3:支付宝网页支付*/
	public Integer getPaymentMode() {
		return paymentMode;
	}
	/**支付方式1：支付宝支付(网页加支付宝钱包)2：微信支付3:支付宝网页支付*/
	public void setPaymentMode(Integer paymentMode) {
		this.paymentMode = paymentMode;
	}
		/**是否显示底部工具栏的首页 1:显示(默认)2:不显示*/
	public Integer getShowBootIndex() {
		return showBootIndex;
	}
	/**是否显示底部工具栏的首页 1:显示(默认)2:不显示*/
	public void setShowBootIndex(Integer showBootIndex) {
		this.showBootIndex = showBootIndex;
	}
		/**是否显示底部工具栏的自定义类目 1:显示(默认)2:不显示*/
	public Integer getShowBootCategory() {
		return showBootCategory;
	}
	/**是否显示底部工具栏的自定义类目 1:显示(默认)2:不显示*/
	public void setShowBootCategory(Integer showBootCategory) {
		this.showBootCategory = showBootCategory;
	}
		/**是否显示底部工具栏的购物车 1:显示(默认)2:不显示*/
	public Integer getShowBootCart() {
		return showBootCart;
	}
	/**是否显示底部工具栏的购物车 1:显示(默认)2:不显示*/
	public void setShowBootCart(Integer showBootCart) {
		this.showBootCart = showBootCart;
	}
		/**是否显示底部工具栏的个人中心 1:显示(默认)2:不显示*/
	public Integer getShowBootCenter() {
		return showBootCenter;
	}
	/**是否显示底部工具栏的个人中心 1:显示(默认)2:不显示*/
	public void setShowBootCenter(Integer showBootCenter) {
		this.showBootCenter = showBootCenter;
	}
		/**首页地址(内部访问)*/
	public String getIndexUrl() {
		return indexUrl;
	}
	/**首页地址(内部访问)*/
	public void setIndexUrl(String indexUrl) {
		this.indexUrl = indexUrl;
	}
		
	@Override
	public String toString() {
		return "Shop [ id=" + id + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify + ", status=" + status + ", saleId=" + saleId + ", partnerId=" + partnerId + ", shopName=" + shopName + ", accessKey=" + accessKey + ", secretKey=" + secretKey + ", url=" + url + ", headPicUrl=" + headPicUrl + ", wxUrl=" + wxUrl + ", thirdUrl=" + thirdUrl + ", paymentMode=" + paymentMode + ", showBootIndex=" + showBootIndex + ", showBootCategory=" + showBootCategory + ", showBootCart=" + showBootCart + ", showBootCenter=" + showBootCenter + ", indexUrl=" + indexUrl + "]";
	}
}
