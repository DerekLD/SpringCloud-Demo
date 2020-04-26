package ld.derek.servicestockapi.bus.api;

import ld.derek.servicestockapi.bus.vo.StockInformationVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sc-service-stock")
public interface StockInformationApi {

    @GetMapping("/api/{id}")
    StockInformationVO getStockByGoodsId(@PathVariable("id") Integer id);
}
