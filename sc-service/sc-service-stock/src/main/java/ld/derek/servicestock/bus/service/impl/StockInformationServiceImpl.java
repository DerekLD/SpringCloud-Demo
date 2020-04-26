package ld.derek.servicestock.bus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ld.derek.servicestock.bus.entity.StockInformation;
import ld.derek.servicestock.bus.mapper.StockInformationMapper;
import ld.derek.servicestock.bus.service.IStockInformationService;
import org.springframework.stereotype.Service;

@Service
public class StockInformationServiceImpl extends ServiceImpl<StockInformationMapper, StockInformation> implements IStockInformationService {
}
