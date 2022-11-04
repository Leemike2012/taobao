package com.mike.taobao.service.impl;

import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.mike.taobao.entity.Trade;
import com.mike.taobao.mapper.TradeMapper;
import com.mike.taobao.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeServiceImpl implements TradeService {
    @Autowired
    private TradeMapper tradeMapper;

    //通过ID查询单条数据
    //@param tradeId 主键
    //@return 实例对象
    
    public Trade queryById(String tradeId){
        return tradeMapper.selectById(tradeId);
    }

    //新增数据
    //@param trade 实例对象
    //@return 实例对象
    
    public Trade insert(Trade trade){
        tradeMapper.insert(trade);
        return trade;
    }


    
    //通过主键删除数据
    //@param tradeId 主键
    //@return 是否成功
    
    public boolean deleteById(String tradeId){
        int total = tradeMapper.deleteById(tradeId);
        return total > 0;
    }
}
