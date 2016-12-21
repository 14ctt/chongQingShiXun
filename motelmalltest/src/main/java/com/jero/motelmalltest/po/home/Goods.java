package com.jero.motelmalltest.po.home;

import java.util.Date;
/**
 * @Description <商品表实体类>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:49:15
 * @version   1.0
 */
public class Goods {
    private String goodsId;

    private String sellerId;

    private String goodsName;

    private String goodsTypeId;

    private String goodsIntroduce;

    private String goodsGuidePrice;

    private Integer goodsSalesVolume;

    private Date storageTime;

    private Date onShelvesTime;

    private Double commentAverage;

    private String goodsTitel;

    private String goodsStatus;

    private String goodsType;

    private String isLock;

    private String unit;

    private String isDelete;

    private String releaseType;

    private String brand;

    private String carType;

    private String goodsDistributionMode;

    private String goodsProcessingStatus;

    private Date informationUpdateTime;

    private String comments;
    
    private GoodsClass goodsClass;
    
    private EnterpriseUser enterpriseUser;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId == null ? null : goodsTypeId.trim();
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce == null ? null : goodsIntroduce.trim();
    }

    public String getGoodsGuidePrice() {
        return goodsGuidePrice;
    }

    public void setGoodsGuidePrice(String goodsGuidePrice) {
        this.goodsGuidePrice = goodsGuidePrice == null ? null : goodsGuidePrice.trim();
    }

    public Integer getGoodsSalesVolume() {
		return goodsSalesVolume;
	}

	public void setGoodsSalesVolume(Integer goodsSalesVolume) {
		this.goodsSalesVolume = goodsSalesVolume;
	}

	public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    public Date getOnShelvesTime() {
        return onShelvesTime;
    }

    public void setOnShelvesTime(Date onShelvesTime) {
        this.onShelvesTime = onShelvesTime;
    }

    public Double getCommentAverage() {
        return commentAverage;
    }

    public void setCommentAverage(Double commentAverage) {
        this.commentAverage = commentAverage;
    }

    public String getGoodsTitel() {
        return goodsTitel;
    }

    public void setGoodsTitel(String goodsTitel) {
        this.goodsTitel = goodsTitel == null ? null : goodsTitel.trim();
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus == null ? null : goodsStatus.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getIsLock() {
        return isLock;
    }

    public void setIsLock(String isLock) {
        this.isLock = isLock == null ? null : isLock.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getReleaseType() {
        return releaseType;
    }

    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType == null ? null : releaseType.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getGoodsDistributionMode() {
        return goodsDistributionMode;
    }

    public void setGoodsDistributionMode(String goodsDistributionMode) {
        this.goodsDistributionMode = goodsDistributionMode == null ? null : goodsDistributionMode.trim();
    }

    public String getGoodsProcessingStatus() {
        return goodsProcessingStatus;
    }

    public void setGoodsProcessingStatus(String goodsProcessingStatus) {
        this.goodsProcessingStatus = goodsProcessingStatus == null ? null : goodsProcessingStatus.trim();
    }

    public Date getInformationUpdateTime() {
        return informationUpdateTime;
    }

    public void setInformationUpdateTime(Date informationUpdateTime) {
        this.informationUpdateTime = informationUpdateTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

	public GoodsClass getGoodsClass() {
		return goodsClass;
	}

	public void setGoodsClass(GoodsClass goodsClass) {
		this.goodsClass = goodsClass;
	}

	public EnterpriseUser getEnterpriseUser() {
		return enterpriseUser;
	}

	public void setEnterpriseUser(EnterpriseUser enterpriseUser) {
		this.enterpriseUser = enterpriseUser;
	}
    
    
}