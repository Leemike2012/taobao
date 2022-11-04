package com.mike.taobao.service;

import com.mike.taobao.dto.TradeOrderDto;
import org.springframework.stereotype.Service;


@Service
public interface TradeOrderService {
    //处理tradeorder
    boolean placeOrder(TradeOrderDto tradeOrderDto);
}
