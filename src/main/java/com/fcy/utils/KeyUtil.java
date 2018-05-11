package com.fcy.utils;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-10
 * Time: 20:32
 */
public class KeyUtil {
    public static synchronized String getOrderIdByUUId() {
        int machineId = 1;//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        String orderId = machineId + String.format("%018d", hashCodeV) + System.currentTimeMillis();
        return orderId;
    }

}
