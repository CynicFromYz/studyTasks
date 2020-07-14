package com.waiqin365.firstdemo.sometest;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author cynic
 * @version 1.0
 * @describe todo
 * @createTime 2020/5/18 10:10
 */
public class CuxiaoPlanCashStandard {
    private String status;

    private Long creatorId;

    private Date createTime;

    private Long modifyierId;

    private Date modifyTime;

    private Long planId;

    private Long itemId;

    private String itemName;

    private String itemDescribe;

    private String itemDescribeJson;

    private BigDecimal cashValue;

    private String pdIdStr;

    private String pdValueJson;

    private String pdValueDesc;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyierId() {
        return modifyierId;
    }

    public void setModifyierId(Long modifyierId) {
        this.modifyierId = modifyierId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescribe() {
        return itemDescribe;
    }

    public void setItemDescribe(String itemDescribe) {
        this.itemDescribe = itemDescribe;
    }

    public String getItemDescribeJson() {
        return itemDescribeJson;
    }

    public void setItemDescribeJson(String itemDescribeJson) {
        this.itemDescribeJson = itemDescribeJson;
    }

    public BigDecimal getCashValue() {
        return cashValue;
    }

    public void setCashValue(BigDecimal cashValue) {
        this.cashValue = cashValue;
    }

    public String getPdIdStr() {
        return pdIdStr;
    }

    public void setPdIdStr(String pdIdStr) {
        this.pdIdStr = pdIdStr;
    }

    public String getPdValueJson() {
        return pdValueJson;
    }

    public void setPdValueJson(String pdValueJson) {
        this.pdValueJson = pdValueJson;
    }

    public String getPdValueDesc() {
        return pdValueDesc;
    }

    public void setPdValueDesc(String pdValueDesc) {
        this.pdValueDesc = pdValueDesc;
    }
}
