package ld.derek.servicegoodsapi.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@ApiModel(value = "GoodsInformationVO", description = "商品信息VO")
public class GoodsInformationVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品ID")
    private Integer id;

    @ApiModelProperty("商品名称")
    private String goodsName;

    @ApiModelProperty("商品库存")
    private Integer stockNum;

    @ApiModelProperty("描述信息")
    private String description;
}
