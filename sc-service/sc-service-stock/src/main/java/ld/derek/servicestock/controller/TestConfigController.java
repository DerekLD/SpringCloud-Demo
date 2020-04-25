package ld.derek.servicestock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class TestConfigController {

    @GetMapping("/getProfile")
    public String hello() {
        return "路由到 库存服务 stock";
    }

}
