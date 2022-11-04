package com.mike.taobao.dto;

public class OrderDto {
    /** 订单金额 */
    private Double orderAmount ;
    /** 订单内容 */
    private String tradeContent ;
    /** 订单金额 */
    public Double getOrderAmount(){
        return this.orderAmount;
    }
    /** 订单金额 */
    public void setOrderAmount(Double orderAmount){
        this.orderAmount=orderAmount;
    }
    /** 订单内容 */
    public String getTradeContent(){
        return this.tradeContent;
    }
    /** 订单内容 */
    public void setTradeContent(String tradeContent){
        this.tradeContent=tradeContent;
    }
}
