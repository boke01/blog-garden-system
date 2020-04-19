package com.zsp.bloggardensystem.entity;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 分页信息
 **/

public class PageInfo {
    private String orderBy;
    private int pageNum;
    private int pageSize;
    private int total;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "orderBy='" + orderBy + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", total=" + total +
                '}';
    }
}
