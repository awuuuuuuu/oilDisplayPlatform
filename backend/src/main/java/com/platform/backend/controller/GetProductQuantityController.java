package com.platform.backend.controller;


import com.platform.backend.pojo.ProductQuantity;
import com.platform.backend.service.GetProductQuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class GetProductQuantityController {
    @Autowired
    private GetProductQuantityService getProductQuantityService;

    @GetMapping("/ProductQuantity/getlist/")
    public List<ProductQuantity> getList() {
        return getProductQuantityService.getList();
    }
}
