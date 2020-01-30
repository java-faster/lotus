package com.coder520.mamabuyschedulerservice.stock.entity;

import java.util.Date;

public class StockFlow {
    private Long id;

    private Long skuid;

    private Integer stockbefore;

    private Integer stockafter;

    private Integer stockchange;

    private Integer lockstockbefore;

    private Integer lockstockafter;

    private Integer lockstockchange;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuid() {
        return skuid;
    }

    public void setSkuid(Long skuid) {
        this.skuid = skuid;
    }

    public Integer getStockbefore() {
        return stockbefore;
    }

    public void setStockbefore(Integer stockbefore) {
        this.stockbefore = stockbefore;
    }

    public Integer getStockafter() {
        return stockafter;
    }

    public void setStockafter(Integer stockafter) {
        this.stockafter = stockafter;
    }

    public Integer getStockchange() {
        return stockchange;
    }

    public void setStockchange(Integer stockchange) {
        this.stockchange = stockchange;
    }

    public Integer getLockstockbefore() {
        return lockstockbefore;
    }

    public void setLockstockbefore(Integer lockstockbefore) {
        this.lockstockbefore = lockstockbefore;
    }

    public Integer getLockstockafter() {
        return lockstockafter;
    }

    public void setLockstockafter(Integer lockstockafter) {
        this.lockstockafter = lockstockafter;
    }

    public Integer getLockstockchange() {
        return lockstockchange;
    }

    public void setLockstockchange(Integer lockstockchange) {
        this.lockstockchange = lockstockchange;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}