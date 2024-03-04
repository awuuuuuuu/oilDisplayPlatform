package com.platform.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.platform.backend.mapper.OilProductionMapper;
import com.platform.backend.pojo.OilProduction;
import com.platform.backend.service.GetOilProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetOilProductionServiceImpl implements GetOilProductionService {
    @Autowired
    private OilProductionMapper OilProductionMapper;

    @Override
    public List<OilProduction> getList() {


        QueryWrapper<OilProduction> queryWrapper = new QueryWrapper<>();

        return OilProductionMapper.selectList(queryWrapper);
    }
}
