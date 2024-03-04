package com.platform.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.platform.backend.mapper.ProductQuantityMapper;
import com.platform.backend.pojo.ProductQuantity;
import com.platform.backend.service.GetProductQuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProductQuantityServiceImpl implements GetProductQuantityService {
    @Autowired
    private ProductQuantityMapper ProductQuantityMapper;

    @Override
    public List<ProductQuantity> getList() {


        QueryWrapper<ProductQuantity> queryWrapper = new QueryWrapper<>();

        return ProductQuantityMapper.selectList(queryWrapper);
    }
}
