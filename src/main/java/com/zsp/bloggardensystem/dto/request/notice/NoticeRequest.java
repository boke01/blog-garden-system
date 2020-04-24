package com.zsp.bloggardensystem.dto.request.notice;

/**
 * @praogram: com.zsp.bloggardensystem.dto.request.notice
 * @author: 朱升鹏
 * @date: 2020/4/24
 * @description: 通知信息请求体
 **/
public class NoticeRequest {
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
        return "NoticeRequest{" +
                "userID=" + userID +
                ", notice='" + notice + '\'' +
                ", noticeStatus='" + noticeStatus + '\'' +
                '}';
    }
}
