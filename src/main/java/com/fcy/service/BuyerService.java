package com.fcy.service;

import com.fcy.dto.OrderDTO;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-13
 * Time: 11:13
 */
public interface BuyerService {
    /**
     * 查询一个订单
     * @param openId
     * @param oderId
     * @return com.fcy.dto.OrderDTO
     */
    OrderDTO findOrderOne(String openId,String oderId);

    /**
     * 取消一个订单
     * @param openId
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openId, String orderId);
}
