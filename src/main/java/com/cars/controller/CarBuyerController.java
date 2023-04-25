package com.cars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.request.CarBuyerRequest;
import com.cars.service.CarBuyerService;

@RestController
@RequestMapping("/api")
public class CarBuyerController {
	
	@Autowired
	CarBuyerService buyerService;

	@PostMapping("/createbuyer/{createdById}")
	public ResponseEntity<?> createBuyer(@PathVariable("createdById") Integer createdById, @RequestBody CarBuyerRequest buyerRequest){
		return buyerService.createBuyer(createdById, buyerRequest);
	}
	
	@GetMapping("/getbuyer/{id}")
	public ResponseEntity<?> getBuyerByBuyerId(@PathVariable("id") Integer buyerId){
		return buyerService.getBuyerByBuyerId(buyerId);
	}
		
	@GetMapping("/getallbuyers/{createdby}")
	public ResponseEntity<?> getAllBuyersByCreatedBy(@PathVariable("createdby") Integer createdBy){
		return buyerService.getAllBuyersByCreatedBy(createdBy);
	}
	
	@DeleteMapping("/deletebuyer/{id}")
	public ResponseEntity<?> deleteBuyerByBuyerId(@PathVariable("id") Integer buyerId){
		return buyerService.deleteBuyerByBuyerId(buyerId);
	}
	
	@PutMapping("/updatebuyer/{modifiedById}")
	public ResponseEntity<?> updateBuyer(@PathVariable("modifiedById") Integer modifiedById, @RequestBody CarBuyerRequest buyerRequest){
		return buyerService.updateBuyer(modifiedById, buyerRequest);
	}
}
