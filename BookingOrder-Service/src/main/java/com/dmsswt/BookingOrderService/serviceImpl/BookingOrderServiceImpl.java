package com.dmsswt.BookingOrderService.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmsswt.BookingOrderService.model.BookingOrder;
import com.dmsswt.BookingOrderService.repository.BookingOrderRepository;
import com.dmsswt.BookingOrderService.service.BookingOrderService;

@Service
public class BookingOrderServiceImpl implements BookingOrderService {
	
	@Autowired
	BookingOrderRepository bookingOrderRepository;

	@Override
	public void saveBookingDetails(BookingOrder bookingOrder) {
		bookingOrderRepository.save(bookingOrder);
		
	}

	@Override
	public Optional<BookingOrder> findById(Integer id) {
		// TODO Auto-generated method stub
		return bookingOrderRepository.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		bookingOrderRepository.deleteById(id);
		
	}

}
