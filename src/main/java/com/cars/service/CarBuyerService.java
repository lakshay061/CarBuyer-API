package com.cars.service;

import org.springframework.http.ResponseEntity;

import com.cars.request.CarBuyerRequest;

public interface CarBuyerService {
	
	ResponseEntity<?> createBuyer(Integer createdById, CarBuyerRequest buyerRequest);
	
	ResponseEntity<?> getBuyerByBuyerId(Integer buyerId);
	
	ResponseEntity<?> getAllBuyersByCreatedBy(Integer createdBy);
	
	ResponseEntity<?> deleteBuyerByBuyerId(Integer buyerId);
	
	ResponseEntity<?> updateBuyer(Integer modifiedById, CarBuyerRequest buyerRequest);

}
