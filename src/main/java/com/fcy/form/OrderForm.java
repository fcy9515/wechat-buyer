package com.fcy.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-12
 * Time: 21:54
 */
@Data
public class OrderForm {
    /* 买家姓名 */
    @NotEmpty(message = "姓名不能为空")
    private String name;
    /* 买家手机号 */
    @NotEmpty(message = "手机号不能为空")
    private String phone;
    /* 买家地址 */
    @NotEmpty(message = "地址不能为空")
    private String address;
    /* 买家微信openID */
    @NotEmpty(message = "微信openID不能为空")
    private String openId;
    /* 购物车 */
    @NotEmpty(message = "购物车不能为空")
    private  String items;
}
