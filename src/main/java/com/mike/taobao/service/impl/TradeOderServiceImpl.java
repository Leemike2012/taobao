package com.mike.taobao.service.impl;

import com.mike.taobao.dto.OrderDto;
import com.mike.taobao.dto.TradeOrderDto;
import com.mike.taobao.entity.Order;
import com.mike.taobao.entity.Trade;
import com.mike.taobao.mapper.OrderMapper;
import com.mike.taobao.mapper.TradeMapper;
import com.mike.taobao.service.OrderService;
import com.mike.taobao.service.TradeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TradeOderServiceImpl implements TradeOrderService  {
    @Autowired
    private TradeMapper tradeMapper;
    @Autowired
    private OrderServiceBatch orderServiceBatch;
    @Override
    public boolean placeOrder(TradeOrderDto tradeOrderDto) {
        //取出Trade部分
        Trade trade = new Trade(tradeOrderDto);
        //获取tradeId,用于标记orderId
        String tradeId = trade.getTradeId();
        //取出OrderDto部分,存入OrderList
        List<Order> orderList = new ArrayList<>();
        for (OrderDto item:tradeOrderDto.getOrders()
             ) {
            orderList.add(new Order(item,tradeId));
        }
        //存储Trade
        tradeMapper.insert(trade);
        //存储OrderList
        orderServiceBatch.saveBatch(orderList);
        return true;
    }
}
