package com.jero.motelmalltest.po.home;

import java.util.Date;
/**
 * @Description <论坛发布表实体类>
 * @author  郑启阳
 * @date  2016年5月25日 下午12:49:15
 * @version   1.0
 */
public class ForumPosting {
    private String fpId;

    private String fpTitle;

    private String fpContent;

    private Date createTime;

    private Date updateTime;

    private String creator;

    private String comments;

    private Integer accessTimes;
    
    public String getFpId() {
        return fpId;
    }

    public void setFpId(String fpId) {
        this.fpId = fpId == null ? null : fpId.trim();
    }

    public String getFpTitle() {
        return fpTitle;
    }

    public void setFpTitle(String fpTitle) {
        this.fpTitle = fpTitle == null ? null : fpTitle.trim();
    }

    public String getFpContent() {
        return fpContent;
    }

    public void setFpContent(String fpContent) {
        this.fpContent = fpContent == null ? null : fpContent.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

	public Integer getAccessTimes() {
		return accessTimes;
	}

	public void setAccessTimes(Integer accessTimes) {
		this.accessTimes = accessTimes;
	}
    
    
}