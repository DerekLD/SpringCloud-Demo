# SpringCloud-Demo

### SpringCloud-Demo是一套自己学习SpringCloud用的最基本框架，能运行的最小单元。
> 2020年4月25日 由于自己对微服务一窍不通，所以决定和朋友一起搭建一套微服务框架。

> 先做最基础的框架，之后再逐步迭代。

> 目前注册中心使用Eureka，网关使用Zuul，数据库Mysql。

> 后期逐渐加上Swagger、Redis， RebbitMQ， Nginx， Docker。

> 目前Mysql与Redis在自己的云服务器上，下载代码后可直接启动。

## 1. 目的
> 让自己通过从0到1的搭建过程，熟悉微服务的设计理念以及前后端的调用流程、服务与服务间的调用。

## 2. 各个模块结构
```text
└── SpringCloud-Demo     // 最外层 管理公共jar
    ├── sc-config-server // 配置中心
    ├── sc-eureka-server // 注册中心
    ├── sc-service       // 业务层
    │   └── sc-service-goods  // 商品管理服务
    │   └── sc-service-order  // 订单管理服务
    │   └── sc-service-stock  // 库存服务
    ├── sc-service-api       // 业务层接口
    │   └── sc-service-goods-api // 商品管理对外开放api接口
    │   └── sc-service-order-api // 订单管理对外开放api接口
    │   └── sc-service-stock-api // 库存管理对外开放api接口
    ├── sc-service-common // 业务层公共组件
    └── sc-servicezuul // 网关
```
## 3. 各模块访问地址
注册中心： [http://127.0.0.1:8001](http://127.0.0.1:8001/)

网关Zuul： [http://127.0.0.1:8002](http://127.0.0.1:8002/)

配置中心： [http://127.0.0.1:8003](http://127.0.0.1:8001/)

商品管理： [http://127.0.0.1:8002/goods/..](http://127.0.0.1:8002/goods/..)

订单管理： [http://127.0.0.1:8002/order/..](http://127.0.0.1:8002/order/..)

库存管理： [http://127.0.0.1:8002/stock/..](http://127.0.0.1:8002/stock/..)

## 4. 联系
- LD  --- Email: 475534443@qq.com
- Lei wang
- Kylin
