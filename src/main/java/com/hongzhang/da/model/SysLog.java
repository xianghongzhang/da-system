package com.hongzhang.da.model;

import java.util.Date;

public class SysLog {
    private Long logId;

    private String description;

    private String logType;

    private String method;

    private String requestIp;

    private Long time;

    private String username;

    private String address;

    private String browser;

    private Date createTime;

    public SysLog(Long logId, String description, String logType, String method, String requestIp, Long time, String username, String address, String browser, Date createTime) {
        this.logId = logId;
        this.description = description;
        this.logType = logType;
        this.method = method;
        this.requestIp = requestIp;
        this.time = time;
        this.username = username;
        this.address = address;
        this.browser = browser;
        this.createTime = createTime;
    }

    public SysLog() {
        super();
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}