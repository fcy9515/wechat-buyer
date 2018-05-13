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
            "name": "女生喜欢",
            "type": 2,
            "foods": [
                {
                    "id": "110",
                    "name": "南瓜粥",
                    "price": 1.8,
                    "description": "好甜的粥",
                    "icon": "http://xxxxx.jpg"
                },
                {
                    "id": "111",
                    "name": "小米粥",
                    "price": 2.1,
                    "description": "很好喝的粥",
                    "icon": "http://xxxxx.jpg"
                },
                {
                    "id": "123456",
                    "name": "小米粥",
                    "price": 3.2,
                    "description": "很好喝的粥",
                    "icon": "http://xxxxx.jpg"
                }
            ]
        },
        {
            "name": "女生喜欢",
            "type": 2,
            "foods": [
                {
                    "id": "110",
                    "name": "南瓜粥",
                    "price": 1.8,
                    "description": "好甜的粥",
                    "icon": "http://xxxxx.jpg"
                },
                {
                    "id": "111",
                    "name": "小米粥",
                    "price": 2.1,
                    "description": "很好喝的粥",
                    "icon": "http://xxxxx.jpg"
                },
                {
                    "id": "123456",
                    "name": "小米粥",
                    "price": 3.2,
                    "description": "很好喝的粥",
                    "icon": "http://xxxxx.jpg"
                }
            ]
        }
    ]
}
```

###创建订单

```
POST /wechat-sell/buyer/order/create
```

参数

```
name: "张三"
phone: "18868822111"
address: "临潼区"
openId: "wx110101" //用户的微信openid
items: [{
    productId: "110",
    productQuantity: 2 //购买数量
}]

```

返回

```json
{
  "code": 0,
  "msg": "成功",
  "data": {
      "orderId": "10000000005882565901525966525948" 
  }
}
```

###订单列表

```
GET /wechat-sell/buyer/order/list
```

参数

```
openId: wx110101
page: 0 //从第0页开始
size: 10
```

返回

```json
{
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "orderId": "10000000005882565901525966525948",
            "buyerName": "张三",
            "buyerPhone": "123456789012",
            "buyerAddress": "陕西",
            "buyerOpenid": "wx110101",
            "orderAmount": 6,
            "orderStatus": 0,
            "payStatus": 1,
            "createTime": 1525966526,
            "updateTime": 1526092998,
            "orderDetailList": null
        },
        {
            "orderId": "10000000006557022471526140531969",
            "buyerName": "张三",
            "buyerPhone": "18868822111",
            "buyerAddress": "临潼区",
            "buyerOpenid": "wx110101",
            "orderAmount": 3.6,
            "orderStatus": 0,
            "payStatus": 0,
            "createTime": 1526140532,
            "updateTime": 1526140532,
            "orderDetailList": null
        }
    ]
}
```

###查询订单详情

```
GET /wechat-sell/buyer/order/detail
```

参数

```
openid: wx110101
orderId: 10000000005882565901525966525948
```

返回

```json
{
    "code": 0,
    "msg": "成功",
    "data": {
        "orderId": "10000000005882565901525966525948",
        "buyerName": "张三",
        "buyerPhone": "123456789012",
        "buyerAddress": "陕西",
        "buyerOpenid": "wx110101",
        "orderAmount": 6,
        "orderStatus": 0,
        "payStatus": 1,
        "createTime": 1525966526,
        "updateTime": 1526092998,
        "orderDetailList": [
            {
                "detailId": "10000000005700985421525966526238",
                "orderId": "10000000005882565901525966525948",
                "productId": "111",
                "productName": "小米粥",
                "productPrice": 2.1,
                "productQuantity": 2,
                "productIcon": "http://xxxxx.jpg",
                "createTime": 1525263168000,
                "updateTime": 1525263168000
            },
            {
                "detailId": "10000000017249950081525966526126",
                "orderId": "10000000005882565901525966525948",
                "productId": "110",
                "productName": "南瓜粥",
                "productPrice": 1.8,
                "productQuantity": 1,
                "productIcon": "http://xxxxx.jpg",
                "createTime": 1525259946000,
                "updateTime": 1525259946000
            }
        ]
    }
}
```

###取消订单

```
POST /wechat-sell/buyer/order/cancel
```

参数

```

```

返回

```
{
    "code": 0,
    "msg": "成功",
    "data": null
}
```

###获取openid

```
重定向到 /wechat-sell/wechat/authorize
```

参数

```
returnUrl: http://xxx.com/abc  //【必填】
```

返回

```
http://xxx.com/abc?openid=oZxSYw5ldcxv6H0EU67GgSXOUrVg
```

###支付订单
```
重定向 /wechat-sell/pay/create
```

参数

```
orderId: 161899085773669363
returnUrl: http://xxx.com/abc/order/161899085773669363
```

返回

```
http://xxx.com/abc/order/161899085773669363
```


