package com.fcy.exception;

import com.fcy.enums.ResultEnum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-10
 * Time: 17:49
 */
public class SellException extends RuntimeException {
    private Integer code;
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
