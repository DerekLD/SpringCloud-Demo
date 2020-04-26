package ld.derek.serviceorder.controller;

import ld.derek.servicegoodsapi.api.ScServiceGoodsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestConfigController {

    @Autowired
    private ScServiceGoodsApi scServiceGoodsApi;

    @GetMapping("/hello")
    public String hello() {
        return "路由到 订单服务 order";
    }

    @GetMapping("/test_openfeign")
    public String testOpenFeign() {
        System.out.println("路由到order服务，开始openFeign寻找goods服务。。。");
        return scServiceGoodsApi.testOpenFeign();
    }

}
