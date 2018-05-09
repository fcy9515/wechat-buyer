package com.fcy.repository;

import com.fcy.entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-08
 * Time: 23:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("102");
        orderMaster.setBuyerName("张三1");
        orderMaster.setBuyerPhone("123456789121");
        orderMaster.setBuyerAddress("临潼");
        orderMaster.setBuyerOpenid("wx110102");
        orderMaster.setOrderAmount(new BigDecimal(5.98));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(1, 1);
        Page<OrderMaster> result = repository.findByBuyerOpenid("wx110101", request);
        // Assert.assertNotEquals(0, result.getTotalElements());
        System.out.println(result);
    }

}