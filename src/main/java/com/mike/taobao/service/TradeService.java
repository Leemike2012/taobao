package com.mike.taobao.service;

import com.mike.taobao.entity.Trade;
import org.springframework.stereotype.Service;

@Service
public interface TradeService {
    // 通过ID查询单条数据
    // @param tradeId 主键
    // @return 实例对象
     
    Trade queryById(String tradeId);
    // 新增数据
    // @param trade 实例对象
    // @return 实例对象
     
    Trade insert(Trade trade);
    // 通过主键删除数据
    // @param tradeId 主键
    // @return 是否成功
    boolean deleteById(String tradeId);
}
