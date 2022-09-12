package com.dmsswt.BookingOrderService.service;

import java.util.List;
import java.util.Optional;

import com.dmsswt.BookingOrderService.model.BookingOrder;

public interface BookingOrderService {

	void saveBookingDetails(BookingOrder bookingOrder);

	Optional<BookingOrder> findById(Integer id);

	void deleteById(Integer id);

	List<BookingOrder> findAll();

}
