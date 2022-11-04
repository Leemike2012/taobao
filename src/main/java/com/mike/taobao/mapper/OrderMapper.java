package com.mike.taobao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mike.taobao.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
