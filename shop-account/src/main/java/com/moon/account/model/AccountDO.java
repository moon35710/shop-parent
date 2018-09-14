package com.moon.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tb_account")
public class AccountDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(name = "login_account", nullable = false, columnDefinition = " varchar(100)  COMMENT '登录账户'")
    private String loginAccount;

    @Column(name = "account_pwd", nullable = false, length = 64, columnDefinition = "varchar(64)  COMMENT '密码'")
    private String accountPwd;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(100)  COMMENT '会员姓名'")
    private String name;

    @Column(name = "tel", nullable = false, columnDefinition = "varchar(100) COMMENT '电话号码'")
    private String tel;

    @Column(name = "address", nullable = false, columnDefinition = " varchar(100) COMMENT '地址'")
    private String address;

    @Column(name = "status", nullable = false, columnDefinition = "varchar(100) COMMENT '状态：active ,inactive ,locked,' ")
    private String status;

    @Column(name = "reg_time", nullable = false, columnDefinition = "DATETIME  COMMENT '注册时间'")
    private Date regTime;

    @Column(name = "lastLoginDate", nullable = false, columnDefinition = "DATETIME  COMMENT '最后登录日期'")
    private Date lastLoginDate;

    @Column(name = "last_login_ip", nullable = false, columnDefinition = "varchar(10) COMMENT '最后登录ip'")
    private String lastLoginIp;
    @Column(name = "login_count", nullable = false, columnDefinition = "int(10) COMMENT '登录次数'")
    private int loginCount;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getAccountPwd() {
        return accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }
}
