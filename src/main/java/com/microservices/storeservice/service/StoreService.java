package com.microservices.storeservice.service;

import com.microservices.storeservice.entity.StoreEntity;

public interface StoreService {

    StoreEntity createStore (StoreEntity store);

    StoreEntity findById(Integer id);
}
