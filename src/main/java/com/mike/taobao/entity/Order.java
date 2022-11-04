package com.mike.taobao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mike.taobao.Utils.IdUtils;
import com.mike.taobao.dto.OrderDto;

@TableName("orders")
public class Order {
    //子订单号
    @TableId
    private String orderId ;
    //所属订单号
    private String tradeId ;
    //订单金额
    private Double orderAmount ;
    //订单内容
    private String tradeContent ;

    
    //根据orderdto构造Order
    public Order(OrderDto orderDto,String tradeId){
        this.orderId = IdUtils.CreateId("O");
        this.tradeId = tradeId;
        this.orderAmount = orderDto.getOrderAmount();
        this.tradeContent = orderDto.getTradeContent();
    }
    //getter 和setter
    //子订单号
    public String getOrderId(){
        return this.orderId;
    }
    //子订单号
    public void setOrderId(String orderId){
        this.orderId=orderId;
    }
    //所属订单号
    public String getTradeId(){
        return this.tradeId;
    }
    //所属订单号
    public void setTradeId(String tradeId){
        this.tradeId=tradeId;
    }
    //订单金额
    public Double getOrderAmount(){
        return this.orderAmount;
    }
    //订单金额
    public void setOrderAmount(Double orderAmount){
        this.orderAmount=orderAmount;
    }
    //订单内容
    public String getTradeContent(){
        return this.tradeContent;
    }
    //订单内容
    public void setTradeContent(String tradeContent){
        this.tradeContent=tradeContent;
    }
}
