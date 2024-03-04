package com.platform.backend.controller;


import com.platform.backend.pojo.Province;
import com.platform.backend.service.GetProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class GetProvinceController {
    @Autowired
    private GetProvinceService getProvinceService;

    @GetMapping("/Province/getlist/")
    public List<Province> getList() {
        return getProvinceService.getList();
    }
}
