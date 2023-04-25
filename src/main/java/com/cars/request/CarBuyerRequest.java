package com.cars.request;

import java.time.LocalDate;

import com.cars.entity.CarBuyer;

public class CarBuyerRequest {

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
	
	
	public static CarBuyer convertToCarBuyer(CarBuyerRequest buyerRequest) {
		
		CarBuyer buyer = new CarBuyer();
		
		buyer.setAddress(buyerRequest.getAddress());
		buyer.setBuyerId(buyerRequest.getBuyerId());
		buyer.setContactNumber(buyerRequest.getContactNumber());
		buyer.setDateOfBirth(buyerRequest.getDateOfBirth());
		buyer.setEmail(buyerRequest.getEmail());
		buyer.setGender(buyerRequest.getGender());
		buyer.setName(buyerRequest.getName());
		buyer.setOccupation(buyerRequest.getOccupation());
		
		return buyer;
	}
}
