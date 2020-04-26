package ld.derek.servicestock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("ld.derek.servicestock.bus.mapper")
@SpringBootApplication
public class ServiceStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceStockApplication.class, args);
    }

}
