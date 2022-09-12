package com.dmsswt.BookingOrderService.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="booking_details")
public class BookingOrder implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date bookingDate;
	private Integer countOfAdults;
	private Integer countOfKids;
//	@NotBlank
	private Double totalAmount;
	
//	@NotBlank
	private Integer trainId;
//	@NotBlank
	private Long userId;
	
	public BookingOrder() {
		
	}

	public BookingOrder(Integer id, Date bookingDate, Integer countOfAdults, Integer countOfKids, Double totalAmount,
			Integer trainId, Long userId) {
		
		this.id = id;
		this.bookingDate = bookingDate;
		this.countOfAdults = countOfAdults;
		this.countOfKids = countOfKids;
		this.totalAmount = totalAmount;
		this.trainId = trainId;
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Integer getCountOfAdults() {
		return countOfAdults;
	}

	public void setCountOfAdults(Integer countOfAdults) {
		this.countOfAdults = countOfAdults;
	}

	public Integer getCountOfKids() {
		return countOfKids;
	}

	public void setCountOfKids(Integer countOfKids) {
		this.countOfKids = countOfKids;
	}

	public BookingOrder(Integer id, Integer countOfAdults, Integer countOfKids) {
		this.id = id;
		this.countOfAdults = countOfAdults;
		this.countOfKids = countOfKids;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}
//
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	public Integer getTrainId() {
		return trainId;
	}
//
	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
	}
//
	public Long getUserId() {
		return userId;
	}
//
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
}
