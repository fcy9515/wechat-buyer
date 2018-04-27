package com.fcy.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-04-27
 * Time: 16:30
 */
@Data
@NoArgsConstructor
@ToString
@Entity
public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId;
    private String categoryName;// 类目名字
    private Integer categoryType;// 类目编号
    private Date createTime;// 创建时间
    private Date updateTime;// 修改时间

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
