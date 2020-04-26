package ld.derek.servicegoods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients("ld.derek.servicestockapi.bus.api")
@EnableConfigurationProperties
@MapperScan("ld.derek.servicegoods.bus")
@SpringBootApplication
public class ServiceGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGoodsApplication.class, args);
    }

}
