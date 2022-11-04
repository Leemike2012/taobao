package com.mike.taobao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mike.taobao.entity.Order;
import com.mike.taobao.mapper.OrderMapper;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceBatch extends ServiceImpl<OrderMapper, Order> {
}
