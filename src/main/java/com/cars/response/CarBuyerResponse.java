package com.cars.response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cars.entity.CarBuyer;

public class CarBuyerResponse {

	private Integer buyerId;
	private String name;
	private String gender;
	private String address;
	private String contactNumber;
	private String email;
	private LocalDate dateOfBirth;
	private String occupation;

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public static CarBuyerResponse convertToCarBuyerResponse(CarBuyer buyer) {
		CarBuyerResponse buyerResponse = new CarBuyerResponse();
		buyerResponse.setAddress(buyer.getAddress());
		buyerResponse.setBuyerId(buyer.getBuyerId());
		buyerResponse.setContactNumber(buyer.getContactNumber());
		buyerResponse.setDateOfBirth(buyer.getDateOfBirth());
		buyerResponse.setEmail(buyer.getEmail());
		buyerResponse.setGender(buyer.getGender());
		buyerResponse.setName(buyer.getName());
		buyerResponse.setOccupation(buyer.getOccupation());
		return buyerResponse;
	}

	public static List<CarBuyerResponse> convertToCarBuyerResponseList(List<CarBuyer> buyerList) {
		
		List<CarBuyerResponse> respList = new ArrayList<>();
		
		for (CarBuyer buyer : buyerList) {
			
			CarBuyerResponse resp = new CarBuyerResponse();
			
			resp.setAddress(buyer.getAddress());
			resp.setBuyerId(buyer.getBuyerId());
			resp.setContactNumber(buyer.getContactNumber());
			resp.setDateOfBirth(buyer.getDateOfBirth());
			resp.setEmail(buyer.getEmail());
			resp.setGender(buyer.getGender());
			resp.setName(buyer.getName());
			resp.setOccupation(buyer.getOccupation());
			respList.add(resp);
		}
		return respList;
	}
}
