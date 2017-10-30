package com.dingtalk.isv.access.api.model.org;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mint on 16-1-22.
 */
public class OrgChannelTokenVO implements Serializable{
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;


    /**
     * 钉钉平台企业ID
     */
    private String corpId;

    /**
     * 企业授权套件服务窗token
     */
    private String corpChannelToken;

    /**
     * 过期时间
     */
    private Date expiredTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getCorpChannelToken() {
        return corpChannelToken;
    }

    public void setCorpChannelToken(String corpChannelToken) {
        this.corpChannelToken = corpChannelToken;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    @Override
    public String toString() {
        return "OrgChannelTokenVO{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", corpId='" + corpId + '\'' +
                ", corpChannelToken='" + corpChannelToken + '\'' +
                ", expiredTime=" + expiredTime +
                '}';
    }
}
