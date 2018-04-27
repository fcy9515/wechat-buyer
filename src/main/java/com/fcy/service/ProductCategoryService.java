package com.fcy.service;

import com.fcy.entity.ProductCategory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-04-27
 * Time: 16:47
 */
public interface ProductCategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
