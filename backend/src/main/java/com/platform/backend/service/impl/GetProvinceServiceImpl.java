package com.platform.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.platform.backend.mapper.ProvinceMapper;
import com.platform.backend.pojo.Province;
import com.platform.backend.service.GetProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProvinceServiceImpl implements GetProvinceService {
    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<Province> getList() {


        QueryWrapper<Province> queryWrapper = new QueryWrapper<>();

        return provinceMapper.selectList(queryWrapper);
    }
}
