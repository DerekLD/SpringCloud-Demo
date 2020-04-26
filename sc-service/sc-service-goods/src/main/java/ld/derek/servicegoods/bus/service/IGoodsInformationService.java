package ld.derek.servicegoods.bus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ld.derek.servicegoods.bus.entity.GoodsInformation;
import ld.derek.servicegoodsapi.vo.GoodsInformationVO;

public interface IGoodsInformationService extends IService<GoodsInformation> {

    /**
     * 根据商品Id获取商品信息
     * @param id
     * @return
     */
    GoodsInformationVO getGoodsInformationByGoodsId(Integer id);
}
