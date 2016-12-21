package com.jero.motelmalltest.po.home;
/**
 * @Description <商品分类表实体类>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:49:15
 * @version   1.0
 */
public class GoodsClass {
    private String goodsClassId;

    private String className;

    private String parentClassId;

    private String hasChild;

    private String goodsClassOrder;

    private String goodsClassStatus;

    private String comments;

    public String getGoodsClassId() {
        return goodsClassId;
    }

    public void setGoodsClassId(String goodsClassId) {
        this.goodsClassId = goodsClassId == null ? null : goodsClassId.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getParentClassId() {
        return parentClassId;
    }

    public void setParentClassId(String parentClassId) {
        this.parentClassId = parentClassId == null ? null : parentClassId.trim();
    }

    public String getHasChild() {
        return hasChild;
    }

    public void setHasChild(String hasChild) {
        this.hasChild = hasChild == null ? null : hasChild.trim();
    }

    public String getGoodsClassOrder() {
        return goodsClassOrder;
    }

    public void setGoodsClassOrder(String goodsClassOrder) {
        this.goodsClassOrder = goodsClassOrder == null ? null : goodsClassOrder.trim();
    }

    public String getGoodsClassStatus() {
        return goodsClassStatus;
    }

    public void setGoodsClassStatus(String goodsClassStatus) {
        this.goodsClassStatus = goodsClassStatus == null ? null : goodsClassStatus.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}