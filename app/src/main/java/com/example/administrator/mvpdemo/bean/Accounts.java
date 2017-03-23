package com.example.administrator.mvpdemo.bean;

import java.io.Serializable;

/**
 * Created by luweicheng on 2017/3/9 0009.
 * 实体类Accounts
 */

public class Accounts  implements Serializable {

    @Override
    public String toString() {
        return "Accounts{" +
                "mid='" + mid + '\'' +
                ", account='" + account + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
                ", session_key='" + session_key + '\'' +
                ", chat_account='" + chat_account + '\'' +
                ", chat_pwd='" + chat_pwd + '\'' +
                ", member_type='" + member_type + '\'' +
                ", balance='" + balance + '\'' +
                ", integral='" + integral + '\'' +
                ", kefu_name='" + kefu_name + '\'' +
                ", kefu_chat_account='" + kefu_chat_account + '\'' +
                ", kefu_chat_pwd='" + kefu_chat_pwd + '\'' +
                ", kefu_tel='" + kefu_tel + '\'' +
                ", order_num='" + order_num + '\'' +
                ", coupon_num='" + coupon_num + '\'' +
                '}';
    }

    /**
     * mid : 8
     * account : 15001093327
     * avatar : http://xsd.gowoai.cn/upload/avatar/2016/09/201609131738_7362.jpg
     * nickname :
     * gender : 保密
     * contact : 15001093327
     * session_key : 44f75b34272783a473b8a3406424e477
     * chat_account : gwa8
     * chat_pwd : 910104
     * member_type : 普通会员
     * balance : 0.01
     * integral : 1
     * kefu_name : 鲜速达客服（北京总部）
     * kefu_chat_account : gowoai
     * kefu_chat_pwd : 88998600
     * kefu_tel : 400-8756-399
     * order_num : 34
     * coupon_num : 0
     */

    private String mid;
    private String account;
    private String avatar;
    private String nickname;
    private String gender;
    private String contact;
    private String session_key;
    private String chat_account;
    private String chat_pwd;
    private String member_type;
    private String balance;
    private String integral;
    private String kefu_name;
    private String kefu_chat_account;
    private String kefu_chat_pwd;
    private String kefu_tel;
    private String order_num;
    private String coupon_num;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getChat_account() {
        return chat_account;
    }

    public void setChat_account(String chat_account) {
        this.chat_account = chat_account;
    }

    public String getChat_pwd() {
        return chat_pwd;
    }

    public void setChat_pwd(String chat_pwd) {
        this.chat_pwd = chat_pwd;
    }

    public String getMember_type() {
        return member_type;
    }

    public void setMember_type(String member_type) {
        this.member_type = member_type;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getKefu_name() {
        return kefu_name;
    }

    public void setKefu_name(String kefu_name) {
        this.kefu_name = kefu_name;
    }

    public String getKefu_chat_account() {
        return kefu_chat_account;
    }

    public void setKefu_chat_account(String kefu_chat_account) {
        this.kefu_chat_account = kefu_chat_account;
    }

    public String getKefu_chat_pwd() {
        return kefu_chat_pwd;
    }

    public void setKefu_chat_pwd(String kefu_chat_pwd) {
        this.kefu_chat_pwd = kefu_chat_pwd;
    }

    public String getKefu_tel() {
        return kefu_tel;
    }

    public void setKefu_tel(String kefu_tel) {
        this.kefu_tel = kefu_tel;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public String getCoupon_num() {
        return coupon_num;
    }

    public void setCoupon_num(String coupon_num) {
        this.coupon_num = coupon_num;
    }
}
