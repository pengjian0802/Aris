package com.pj.aris.entity.order;

import com.pj.common.entity.BaseEntity;

import java.math.BigDecimal;

/**
 * Created by pengjian on 2018/6/10.
 */
public class Order extends BaseEntity {

    private Integer id;
    private String orderId;
    private BigDecimal orderAmount;
    private Integer skuTotalQty;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getSkuTotalQty() {
        return skuTotalQty;
    }

    public void setSkuTotalQty(Integer skuTotalQty) {
        this.skuTotalQty = skuTotalQty;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
