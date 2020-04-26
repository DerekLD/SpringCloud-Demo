package ld.derek.servicegoods.bus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import ld.derek.servicecommon.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "goods_information")
@ApiModel(value = "GoodsInformationBO", description = "商品信息BO")
public class GoodsInformation extends BaseEntity {

    private static final long serilVersionUID = 1L;

    private String goodsName;

    private String description;
}
