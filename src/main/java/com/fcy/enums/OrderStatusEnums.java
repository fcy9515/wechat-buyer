package com.fcy.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-08
 * Time: 23:00
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnums {
    NEW(0, "新下单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;
    private Integer code;
    private String message;

}
