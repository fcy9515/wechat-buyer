package com.fcy.repository;

import com.fcy.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-04-29
 * Time: 13:15
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    /**
     * 通过商品状态查询
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
