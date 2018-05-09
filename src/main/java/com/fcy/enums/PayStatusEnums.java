package com.fcy.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-08
 * Time: 23:09
 */
@AllArgsConstructor
@Getter
public enum PayStatusEnums {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");
    private Integer code;
    private String msg;
}
