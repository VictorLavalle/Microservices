package com.microservices.storeservice.repository;

import com.microservices.storeservice.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository <StoreEntity, Integer> {
}
