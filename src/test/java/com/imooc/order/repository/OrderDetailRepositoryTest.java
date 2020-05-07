package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetailRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12323");
        orderDetail.setOrderId("134214");
        orderDetail.setProductIcon("18888888");
        orderDetail.setProductId("12424");
        orderDetail.setProductName("护理");
        orderDetail.setProductPrice(new BigDecimal(123));
        orderDetail.setProductQuantity(10023);
        orderDetail.setCreateTime(new Date());
        OrderDetail result = orderDetailRepository.save(orderDetail);

        Assert.assertTrue(result!=null);
    }
}