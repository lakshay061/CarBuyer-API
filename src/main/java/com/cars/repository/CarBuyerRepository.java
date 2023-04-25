package com.cars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.entity.CarBuyer;

@Repository
public interface CarBuyerRepository extends JpaRepository<CarBuyer, Integer>{
	
	List<CarBuyer> findAllByCreatedBy(Integer createdBy);
}
