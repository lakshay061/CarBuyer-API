package com.cars.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_buyer")
public class CarBuyer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer buyerId;

	@Column
	private String name;

	@Column
	private String gender;

	@Column
	private String address;

	@Column
	private String contactNumber;

	@Column
	private String email;

	@Column
	private LocalDate dateOfBirth;

	@Column
	private String occupation;
	
	@Column(updatable = false)
	private Integer	createdBy;
	
	@Column(updatable = false)
	private LocalDateTime createdOn;
	
	@Column
	private Integer	modifiedBy;
	
	@Column
	private LocalDateTime modifiedOn;

	
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

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(LocalDateTime modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public CarBuyer(Integer buyerId, String name, String gender, String address, String contactNumber, String email,
			LocalDate dateOfBirth, String occupation, Integer createdBy, LocalDateTime createdOn, Integer modifiedBy,
			LocalDateTime modifiedOn) {
		super();
		this.buyerId = buyerId;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.occupation = occupation;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}

	public CarBuyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CarBuyer [buyerId=" + buyerId + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ ", contactNumber=" + contactNumber + ", email=" + email + ", dateOfBirth=" + dateOfBirth
				+ ", occupation=" + occupation + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + "]";
	}

}