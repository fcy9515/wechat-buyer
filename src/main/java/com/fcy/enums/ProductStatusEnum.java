package com.fcy.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-02
 * Time: 19:56
 */
@Getter
public enum ProductStatusEnum implements CodeEnums {
    UP(0, "在架"),
    DOWN(1, "下架");
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
