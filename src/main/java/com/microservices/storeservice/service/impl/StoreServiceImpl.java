package com.microservices.storeservice.service.impl;

import com.microservices.storeservice.entity.StoreEntity;
import com.microservices.storeservice.repository.StoreRepository;
import com.microservices.storeservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreRepository storeRepository;

    @Override
    public StoreEntity createStore(StoreEntity store) {
        return storeRepository.save(store);
    }

    @Override
    public StoreEntity findById(Integer id) {
        return storeRepository.findById(id).get();
    }
}
