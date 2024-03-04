package com.platform.backend.controller;


import com.platform.backend.pojo.OilProduction;
import com.platform.backend.service.GetOilProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class GetOilProductionController {
    @Autowired
    private GetOilProductionService getOilProductionService;

    @GetMapping("/OilProduction/getlist/")
    public List<OilProduction> getList() {
        return getOilProductionService.getList();
    }
}
