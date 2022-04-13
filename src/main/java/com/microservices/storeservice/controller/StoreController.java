package com.microservices.storeservice.controller;

import com.microservices.storeservice.entity.StoreEntity;
import com.microservices.storeservice.service.StoreService;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping("/save")
    public StoreEntity createStore(@RequestBody StoreEntity store){
       return storeService.createStore(store);
    }

    @GetMapping("/{store-id}")
    public StoreEntity getStoreById(@PathVariable("store-id") Integer id){
        return storeService.findById(id);

    }
}
