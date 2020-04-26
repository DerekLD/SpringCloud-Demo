package ld.derek.servicegoods.bus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ld.derek.servicegoods.bus.entity.GoodsInformation;
import ld.derek.servicegoods.bus.mapper.GoodsInformationMapper;
import ld.derek.servicegoods.bus.service.IGoodsInformationService;
import ld.derek.servicegoodsapi.vo.GoodsInformationVO;
import ld.derek.servicestockapi.bus.api.StockInformationApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsInformationImpl extends ServiceImpl<GoodsInformationMapper, GoodsInformation> implements IGoodsInformationService {

    @Autowired
    private StockInformationApi stockInformationApi;

    /**
     * 根据商品Id获取商品信息
     * @param id 商品Id
     * @return
     */
    @Override
    public GoodsInformationVO getGoodsInformationByGoodsId(Integer id) {
        GoodsInformation goodsInformation = baseMapper.selectById(id);
        return new GoodsInformationVO()
                .setId(id)
                .setGoodsName(goodsInformation.getGoodsName())
                .setDescription(goodsInformation.getDescription())
                .setStockNum(stockInformationApi.getStockByGoodsId(id).getStockNum());
    }
}
