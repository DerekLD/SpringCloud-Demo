package ld.derek.servicegoodsapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="sc-service-goods")
public interface ScServiceGoodsApi {

    @GetMapping("/api/test_openfeign")
    String testOpenFeign();

}
