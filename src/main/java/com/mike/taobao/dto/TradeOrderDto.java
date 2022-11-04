package com.mike.taobao.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mike.taobao.entity.Order;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class TradeOrderDto {
    /** 子订单数量 */
    private Integer orderCount ;
    /** 下单人 */
    private String tradePerson ;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime ;
    /** 订单状态 */
    private Integer tradeStatus ;
    /** 子订单列表*/
    private List<OrderDto> orders;

    /** 子订单数量 */
    public Integer getOrderCount(){
        return this.orderCount;
    }
    /** 子订单数量 */
    public void setOrderCount(Integer orderCount){
        this.orderCount=orderCount;
    }
    /** 下单人 */
    public String getTradePerson(){
        return this.tradePerson;
    }
    /** 下单人 */
    public void setTradePerson(String tradePerson){
        this.tradePerson=tradePerson;
    }
    /** 创建时间 */
    public Date getCreateTime(){
        return this.createTime;
    }
    /** 创建时间 */
    public void setCreateTime(Date createTime){
        this.createTime=createTime;
    }
    /** 订单状态 */
    public Integer getTradeStatus(){
        return this.tradeStatus;
    }
    /** 订单状态 */
    public void setTradeStatus(Integer tradeStatus){
        this.tradeStatus=tradeStatus;
    }
    /** 子订单列表*/
    public List<OrderDto> getOrders(){
        return this.orders;
    }
    /** 子订单列表*/
    public void setOrders(List<OrderDto> orders){
        this.orders = orders;
    }
}
