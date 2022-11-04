package com.mike.taobao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mike.taobao.entity.Order;
import org.springframework.stereotype.Service;


@Service
public interface OrderService {
    //通过id查询单条数据
    Order queryById(String orderId);
    //新增数据
    Order insert(Order order);
    //通过主键删除数据，返回是否成功
    boolean deleteById(String orderId);
}
