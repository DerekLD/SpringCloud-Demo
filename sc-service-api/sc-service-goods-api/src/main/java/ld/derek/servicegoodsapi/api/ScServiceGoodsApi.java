package ld.derek.servicegoodsapi.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="sc-service-goods")
public interface ScServiceGoodsApi {

    @GetMapping(value = "/api/test_openfeign")
    String testOpenFeign();

}
