package com.fcy.entity;

import com.fcy.enums.OrderStatusEnums;
import com.fcy.enums.PayStatusEnums;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-08
 * Time: 22:34
 */
@Entity
@Data
@ToString
public class OrderMaster {
    /* 订单编号 */
    @Id
    private String orderId;
    /* 买家名字 */
    private String buyerName;
    /* 买家电话 */
    private String buyerPhone;
    /* 买家地址 */
    private String buyerAddress;
    /* 买家微信openid */
    private String buyerOpenid;
    /* 订单总金额 */
    private BigDecimal orderAmount;
    /* 订单状态, 默认为新下单 */
    private Integer orderStatus = OrderStatusEnums.NEW.getCode();
    /* 支付状态, 默认未支付 */
    private Integer pay_status = PayStatusEnums.WAIT.getCode();
    /* 创建时间 */
    private Date createTime;
    /* 修改时间 */
    private Date updateTime;
}
