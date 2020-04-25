package ld.derek.servicegoods.bus.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestConfigController {

    @GetMapping("/hello")
    public String hello() {
        return "路由到 商品管理服务 goods";
    }

    @GetMapping("/test_openfeign")
    public String testOpenFeign() {
        return "Open Feign 成功。";
    }
}
