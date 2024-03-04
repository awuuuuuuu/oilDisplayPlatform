package com.platform.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.platform.backend.mapper.OilInventoryMapper;
import com.platform.backend.pojo.OilInventory;
import com.platform.backend.service.GetOilInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetOilInventoryServiceImpl implements GetOilInventoryService {
    @Autowired
    private OilInventoryMapper OilInventoryMapper;

    @Override
    public List<OilInventory> getList() {


        QueryWrapper<OilInventory> queryWrapper = new QueryWrapper<>();

        return OilInventoryMapper.selectList(queryWrapper);
    }
}
