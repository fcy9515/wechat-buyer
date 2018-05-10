package com.fcy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-10
 * Time: 23:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
    private String productId;
    private Integer productQuantity;
}
