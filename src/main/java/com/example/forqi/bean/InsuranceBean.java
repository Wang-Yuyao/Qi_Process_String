package com.example.forqi.bean;

import org.springframework.stereotype.Component;

@Component
public class InsuranceBean {
    private String branch;
    private String wsm;
    private String product;
    private String buy_limit_Date;
    private String total_fee;
    private String middle_fee;
    private String add_fee;
    private String expired_date;
    private String online;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getWsm() {
        return wsm;
    }

    public void setWsm(String wsm) {
        this.wsm = wsm;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBuy_limit_Date() {
        return buy_limit_Date;
    }

    public void setBuy_limit_Date(String buy_limit_Date) {
        this.buy_limit_Date = buy_limit_Date;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getMiddle_fee() {
        return middle_fee;
    }

    public void setMiddle_fee(String middle_fee) {
        this.middle_fee = middle_fee;
    }

    public String getAdd_fee() {
        return add_fee;
    }

    public void setAdd_fee(String add_fee) {
        this.add_fee = add_fee;
    }

    public String getExpired_date() {
        return expired_date;
    }

    public void setExpired_date(String expired_date) {
        this.expired_date = expired_date;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getPrivate_customer() {
        return private_customer;
    }

    public void setPrivate_customer(String private_customer) {
        this.private_customer = private_customer;
    }

    public String getWechat_company() {
        return wechat_company;
    }

    public void setWechat_company(String wechat_company) {
        this.wechat_company = wechat_company;
    }

    public String getCustomer_poll() {
        return customer_poll;
    }

    public void setCustomer_poll(String customer_poll) {
        this.customer_poll = customer_poll;
    }

    private String private_customer;
    private String wechat_company;
    private String customer_poll;
}
