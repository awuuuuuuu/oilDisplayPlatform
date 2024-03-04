package com.platform.backend.controller;


import com.platform.backend.pojo.OilInventory;
import com.platform.backend.service.GetOilInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class GetOilInventoryController {
    @Autowired
    private GetOilInventoryService getOilInventoryService;

    @GetMapping("/OilInventory/getlist/")
    public List<OilInventory> getList() {
        return getOilInventoryService.getList();
    }
}
