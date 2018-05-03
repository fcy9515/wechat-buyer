##买家商品API设计:
商品列表：

`GET /wechat-sell/buyer/product/list`

参数
```
无
```

返回

```
{
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "name": "热销榜",
            "type": 1,
            "foods": [
                {
                    "id": "123456",
                    "name": "南瓜粥",
                    "price": 1.5,
                    "description": "很甜的南瓜粥",
                    "icon": "http://xxx.com",
                }
            ]
        },
        {
            "name": "好吃的",
            "type": 2,
            "foods": [
                {
                    "id": "123457",
                    "name": "慕斯蛋糕",
                    "price": 10.9,
                    "description": "美味爽口",
                    "icon": "http://xxx.com",
                }
            ]
        }
    ]
}
```