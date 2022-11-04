package com.mike.taobao.service.impl;



import com.mike.taobao.entity.Order;
import com.mike.taobao.mapper.OrderMapper;
import com.mike.taobao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderServiceImpl  implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    //通过ID查询单条数据
    //@param orderId 主键
    //@return 实例对象
    
    public Order queryById(String orderId){
        return orderMapper.selectById(orderId);
    }

    
    //新增数据
    // @param order 实例对象
    // @return 实例对象
     
    public Order insert(Order order){
        orderMapper.insert(order);
        return order;
    }

    //通过主键删除数据
    //@param orderId 主键
    //@return 是否成功
    public boolean deleteById(String orderId){
        int total = orderMapper.deleteById(orderId);
        return total > 0;
    }
}
