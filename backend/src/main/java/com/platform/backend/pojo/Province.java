package com.platform.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Province {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String provinceName;
    private String capitalCity;
    private Double grossDomesticProduct;
    private String region;
}
