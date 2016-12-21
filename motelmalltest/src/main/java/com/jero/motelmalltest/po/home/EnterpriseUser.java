package com.jero.motelmalltest.po.home;

import java.util.Date;

import com.jero.motelmalltest.po.user.User;
/**
 * @Description <企业用户表>
 * @author  郑启阳
 * @date  2016年5月26日 下午7:14:26
 * @version   1.0
 */
public class EnterpriseUser {
    private String enterpriseUserId;

    private String userId;

    private String enterpriseName;

    private String enterpriseAddress;

    private String enterpriseContact;

    private String enterpriseZipCode;

    private String enterpriseStatus;

    private Integer availableIntegral;

    private Integer freezingIntegral;

    private Date modifiTime;

    private String comments;
    
    private User user;

    public String getEnterpriseUserId() {
        return enterpriseUserId;
    }

    public void setEnterpriseUserId(String enterpriseUserId) {
        this.enterpriseUserId = enterpriseUserId == null ? null : enterpriseUserId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress == null ? null : enterpriseAddress.trim();
    }

    public String getEnterpriseContact() {
        return enterpriseContact;
    }

    public void setEnterpriseContact(String enterpriseContact) {
        this.enterpriseContact = enterpriseContact == null ? null : enterpriseContact.trim();
    }

    public String getEnterpriseZipCode() {
        return enterpriseZipCode;
    }

    public void setEnterpriseZipCode(String enterpriseZipCode) {
        this.enterpriseZipCode = enterpriseZipCode == null ? null : enterpriseZipCode.trim();
    }

    public String getEnterpriseStatus() {
        return enterpriseStatus;
    }

    public void setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus == null ? null : enterpriseStatus.trim();
    }

    public Integer getAvailableIntegral() {
		return availableIntegral;
	}

	public void setAvailableIntegral(Integer availableIntegral) {
		this.availableIntegral = availableIntegral;
	}

	public Integer getFreezingIntegral() {
		return freezingIntegral;
	}

	public void setFreezingIntegral(Integer freezingIntegral) {
		this.freezingIntegral = freezingIntegral;
	}

	public Date getModifiTime() {
        return modifiTime;
    }

    public void setModifiTime(Date modifiTime) {
        this.modifiTime = modifiTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
}