package com.fcy.service.impl;

import com.fcy.entity.ProductCategory;
import com.fcy.service.ProductCategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-04-27
 * Time: 16:51
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryServiceTest {
    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = productCategoryService.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> list = productCategoryService.findAll();
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void findByCategoryTypeIn() {

        List<ProductCategory> list = productCategoryService.findByCategoryTypeIn(Arrays.asList(2, 3, 4));
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("女生喜欢", 2);
        ProductCategory result = productCategoryService.save(productCategory);
        Assert.assertNotNull(result);
    }

}