package com.cars.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cars.entity.CarBuyer;
import com.cars.repository.CarBuyerRepository;
import com.cars.request.CarBuyerRequest;
import com.cars.response.BaseResponse;
import com.cars.response.CarBuyerResponse;

@Service
public class CarBuyerServiceImpl implements CarBuyerService {

	@Autowired
	CarBuyerRepository buyerRepository;

	@Override
	public ResponseEntity<?> createBuyer(Integer createdById, CarBuyerRequest buyerRequest) {

		BaseResponse<CarBuyerResponse> baseResponse = new BaseResponse<>();

		if (buyerRequest != null) {
			CarBuyer buyer = CarBuyerRequest.convertToCarBuyer(buyerRequest);
			buyer.setCreatedBy(createdById);
			buyer.setCreatedOn(LocalDateTime.now());
			buyerRepository.save(buyer);
			CarBuyerResponse buyerResponse = CarBuyerResponse.convertToCarBuyerResponse(buyer);
			baseResponse.setStatus(200);
			baseResponse.setMessage("Buyer Successfully Created ..");
			baseResponse.setData(buyerResponse);
		}
		return ResponseEntity.ok(baseResponse);
	}

	@Override
	public ResponseEntity<?> getBuyerByBuyerId(Integer buyerId) {
		BaseResponse<CarBuyerResponse> baseResponse = new BaseResponse<>();
		CarBuyer buyer = buyerRepository.findById(buyerId).orElse(null);
		if (buyer != null) {
			CarBuyerResponse buyerResponse = CarBuyerResponse.convertToCarBuyerResponse(buyer);
			baseResponse.setStatus(200);
			baseResponse.setMessage("Buyer Details Fetched Successfully..");
			baseResponse.setData(buyerResponse);
		} else {
			baseResponse.setStatus(200);
			baseResponse.setMessage("Buyer Details Not Found!!");
		}
		return ResponseEntity.ok(baseResponse);
	}

	@Override
	public ResponseEntity<?> getAllBuyersByCreatedBy(Integer createdBy) {

		BaseResponse<CarBuyerResponse> baseResponse = new BaseResponse<>();
		List<CarBuyer> buyers = buyerRepository.findAllByCreatedBy(createdBy);
		if (buyers != null) {
			List<CarBuyerResponse> buyerResponse = CarBuyerResponse.convertToCarBuyerResponseList(buyers);
			baseResponse.setStatus(200);
			baseResponse.setMessage("Buyer Details Fetched Successfully..");
			baseResponse.setDataList(buyerResponse);
		} else {
			baseResponse.setStatus(200);
			baseResponse.setMessage("Buyer Details Not Found!!");
		}
		return ResponseEntity.ok(baseResponse);
	}
	
	@Override
	public ResponseEntity<?> deleteBuyerByBuyerId(Integer buyerId) {
		BaseResponse<CarBuyerResponse> baseResponse = new BaseResponse<>();
		CarBuyer buyer = buyerRepository.findById(buyerId).orElse(null);
		if(buyer != null) {
			buyerRepository.deleteById(buyerId);
			baseResponse.setStatus(200);
			baseResponse.setMessage("Buyer Details Successfully Deleted ..");			
		}
		else {
			baseResponse.setStatus(200);
			baseResponse.setMessage("Buyer Details Not Found!!");
		}
		return ResponseEntity.ok(baseResponse);
	}
	
	@Override
	public ResponseEntity<?> updateBuyer(Integer modifiedById, CarBuyerRequest buyerRequest) {
		BaseResponse<CarBuyerResponse> baseResponse = new BaseResponse<>();

		if (buyerRequest != null) {
			CarBuyer buyer = CarBuyerRequest.convertToCarBuyer(buyerRequest);
			buyer.setModifiedBy(modifiedById);
			buyer.setModifiedOn(LocalDateTime.now());
			buyerRepository.save(buyer);
			CarBuyerResponse buyerResponse = CarBuyerResponse.convertToCarBuyerResponse(buyer);
			baseResponse.setStatus(200);
			baseResponse.setMessage("Buyer Successfully Updated..");
			baseResponse.setData(buyerResponse);
		}
		return ResponseEntity.ok(baseResponse);
	}
}
