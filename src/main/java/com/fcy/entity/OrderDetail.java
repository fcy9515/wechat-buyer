package com.fcy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-09
 * Time: 10:02
 */

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
public class OrderDetail {
    @Id
    private String detailId;
    /* 订单编号 */
    private String orderId;
    private String productId;
    /* 商品名称 */
    private String productName;
    /* 商品价格 */
    private BigDecimal productPrice;
    /* 商品数量 */
    private Integer productQuantity;
    /* 图标 */
    private String productIcon;
    /* 创建时间 */
    private Date createTime;
    /* 修改时间 */
    private Date updateTime;
}
