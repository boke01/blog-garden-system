package com.zsp.bloggardensystem.entity;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/4/22
 * @description: 通知信息实体
 **/
public class NoticeEntity {
    private int userID;
    private String notice;
    private String noticeStatus;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    @Override
    public String toString() {
        return "NoticeEntity{" +
                "userID=" + userID +
                ", notice='" + notice + '\'' +
                ", noticeStatus='" + noticeStatus + '\'' +
                '}';
    }
}
