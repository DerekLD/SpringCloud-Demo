package ld.derek.servicegoods.bus.web.controller;

import ld.derek.servicecommon.base.web.BaseController;
import ld.derek.servicegoods.bus.service.IGoodsInformationService;
import ld.derek.servicegoodsapi.vo.GoodsInformationVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController extends BaseController {

    @Autowired
    private IGoodsInformationService goodsInformationService;

    @GetMapping("/{id}")
    public GoodsInformationVO getGoodsInformation(@PathVariable("id") Integer id) {
        return goodsInformationService.getGoodsInformationByGoodsId(id);
    }
}
