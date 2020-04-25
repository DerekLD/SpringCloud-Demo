package ld.derek.serviceorder.controller;

import ld.derek.servicegoodsapi.feign.ScServiceGoodsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
        return scServiceGoodsApi.testOpenFeign();
    }

}
