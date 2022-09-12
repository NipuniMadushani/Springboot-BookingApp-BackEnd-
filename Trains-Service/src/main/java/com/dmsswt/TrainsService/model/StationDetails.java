package com.dmsswt.TrainsService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stations")
public class StationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stationId;
	private String stationName;
	private String line;
	private Integer phoneNumber;
	
	public StationDetails() {
		
	}

	public StationDetails(Integer stationId, String stationName, String line, Integer phoneNumber) {
		this.stationId = stationId;
		this.stationName = stationName;
		this.line = line;
		this.phoneNumber = phoneNumber;
	}

	public Integer getStationId() {
		return stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
   
}
