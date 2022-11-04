package com.mike.taobao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mike.taobao.Utils.IdUtils;
import com.mike.taobao.dto.TradeOrderDto;

import java.util.Date;

@TableName("trade")
public class Trade {
    //订单号
    @TableId
    private String tradeId ;
    //子订单数量
    private Integer orderCount ;
    //下单人
    private String tradePerson ;
    //下单时间
    private Date createTime ;
    //订单状态
    private Integer tradeStatus ;


    public Trade(TradeOrderDto tradeOrderDto){
        this.tradeId = IdUtils.CreateId("T");
        this.orderCount = tradeOrderDto.getOrderCount();
        this.tradePerson = tradeOrderDto.getTradePerson();
        this.createTime = tradeOrderDto.getCreateTime();
        this.tradeStatus = tradeOrderDto.getTradeStatus();
    }

    //订单号
    public String getTradeId(){
        return this.tradeId;
    }
    //订单号
    public void setTradeId(String tradeId){
        this.tradeId=tradeId;
    }
    //子订单数量
    public Integer getOrderCount(){
        return this.orderCount;
    }
    //子订单数量
    public void setOrderCount(Integer orderCount){
        this.orderCount=orderCount;
    }
    //下单人
    public String getTradePerson(){
        return this.tradePerson;
    }
    //下单人
    public void setTradePerson(String tradePerson){
        this.tradePerson=tradePerson;
    }
    //下单时间
    public Date getCreateTime(){
        return this.createTime;
    }
    //下单时间
    public void setCreateTime(Date createTime){
        this.createTime=createTime;
    }
    //订单状态
    public Integer getTradeStatus(){
        return this.tradeStatus;
    }
    //订单状态
    public void setTradeStatus(Integer tradeStatus){
        this.tradeStatus=tradeStatus;
    }
}
