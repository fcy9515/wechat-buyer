package com.fcy.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:商品(包含类目)
 * User: feichangyong
 * Date: 2018-05-03
 * Time: 22:34
 */
@Data
public class ProductVO<T> {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<T> list;
}
