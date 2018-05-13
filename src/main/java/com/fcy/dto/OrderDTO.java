package com.fcy.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fcy.entity.OrderDetail;
import com.fcy.utils.serialize.Date2LongSerialize;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-10
 * Time: 16:18
 */
@Data
public class OrderDTO {
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
    private Integer orderStatus;
    /* 支付状态, 默认未支付 */
    private Integer payStatus;
    /* 创建时间 */
    @JsonSerialize(using = Date2LongSerialize.class)
    private Date createTime;
    /* 修改时间 */
    @JsonSerialize(using = Date2LongSerialize.class)
    private Date updateTime;
    private List<OrderDetail> orderDetailList;
}
