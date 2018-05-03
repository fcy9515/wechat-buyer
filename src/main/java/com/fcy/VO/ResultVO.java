package com.fcy.VO;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:HTTP请求的最外层对象
 * User: feichangyong
 * Date: 2018-05-03
 * Time: 22:28
 */
@Data
public class ResultVO<T> {
    /* 错误码 */
    private Integer code;
    /* 提示信息 */
    private String msg;
    /* 具体内容 */
    private T data;
}
