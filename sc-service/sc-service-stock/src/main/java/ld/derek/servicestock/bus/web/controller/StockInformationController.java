package ld.derek.servicestock.bus.web.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import io.swagger.annotations.Api;
import ld.derek.servicecommon.base.web.BaseController;
import ld.derek.servicestock.bus.entity.StockInformation;
import ld.derek.servicestock.bus.service.IStockInformationService;
import ld.derek.servicestockapi.bus.vo.StockInformationVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "库存信息Api", tags = "Stock-Management")
public class StockInformationController extends BaseController {

    @Autowired
    private IStockInformationService stockInformationService;

    @GetMapping("/{id}")
    public StockInformationVO getStockNumByGoods(@PathVariable int id) {
        QueryWrapper<StockInformation> queryWrapper = Wrappers.query();
        StockInformation stockInformation = stockInformationService.getOne(queryWrapper.eq("goods_id", id));
        StockInformationVO stockInformationVO = new StockInformationVO();
        BeanUtils.copyProperties(stockInformation, stockInformationVO);
        return stockInformationVO;
    }
}
