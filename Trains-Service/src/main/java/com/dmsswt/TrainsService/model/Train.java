package com.dmsswt.TrainsService.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trains")
public class Train implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trainId;
	private String trainCode;
	private String trainName;
	private String trainDescription;
	private String startStation;
	private String endStation;
	private String departsTime;
	private String arrivesTime;
	private String trainType;
	private Double priceForAdult;
	private Double priceForKid;
	
	@Column(name="image")
	private String imageUrl;
	
	private Boolean isAvailable;
	private Integer amountOfAvailableSeats;
	
	public Train() {
		
	}

	
	public Train(Integer trainId, String trainCode, String trainName, String trainDescription, String startStation,
			String endStation, String departsTime, String arrivesTime, String trainType, Double priceForAdult,
			Double priceForKid, String imageUrl, Boolean isAvailable, Integer amountOfAvailableSeats) {
		super();
		this.trainId = trainId;
		this.trainCode = trainCode;
		this.trainName = trainName;
		this.trainDescription = trainDescription;
		this.startStation = startStation;
		this.endStation = endStation;
		this.departsTime = departsTime;
		this.arrivesTime = arrivesTime;
		this.trainType = trainType;
		this.priceForAdult = priceForAdult;
		this.priceForKid = priceForKid;
		this.imageUrl = imageUrl;
		this.isAvailable = isAvailable;
		this.amountOfAvailableSeats = amountOfAvailableSeats;
	}


	public Integer getTrainId() {
		return trainId;
	}

	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
	}

	public String getTrainCode() {
		return trainCode;
	}

	public void setTrainCode(String trainCode) {
		this.trainCode = trainCode;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainDescription() {
		return trainDescription;
	}

	public void setTrainDescription(String trainDescription) {
		this.trainDescription = trainDescription;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public Double getPriceForAdult() {
		return priceForAdult;
	}

	public void setPriceForAdult(Double priceForAdult) {
		this.priceForAdult = priceForAdult;
	}

	public Double getPriceForKid() {
		return priceForKid;
	}

	public void setPriceForKid(Double priceForKid) {
		this.priceForKid = priceForKid;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Integer getAmountOfAvailableSeats() {
		return amountOfAvailableSeats;
	}

	public void setAmountOfAvailableSeats(Integer amountOfAvailableSeats) {
		this.amountOfAvailableSeats = amountOfAvailableSeats;
	}


	public String getDepartsTime() {
		return departsTime;
	}


	public void setDepartsTime(String departsTime) {
		this.departsTime = departsTime;
	}


	public String getArrivesTime() {
		return arrivesTime;
	}


	public void setArrivesTime(String arrivesTime) {
		this.arrivesTime = arrivesTime;
	}
	
	



}
