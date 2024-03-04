package com.platform.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductQuantity {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String provinceName;
    private Double refinedProducts;
    private Double chemicalProducts;
    private Double gasoline;
    private Double diesel;
    private Double lubricatingOil;
    private Double fertilizer;
    private Double kerosene;
}
