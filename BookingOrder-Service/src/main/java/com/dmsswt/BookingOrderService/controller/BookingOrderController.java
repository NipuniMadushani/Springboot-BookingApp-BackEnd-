package com.dmsswt.BookingOrderService.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmsswt.BookingOrderService.model.BookingOrder;
import com.dmsswt.BookingOrderService.service.BookingOrderService;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/booking")

public class BookingOrderController {
	
	@Autowired
	private BookingOrderService bookingOrderService;

	@PostMapping("/ticket")
	public String saveBook(@Valid @RequestBody BookingOrder bookingOrder) {
		System.out.println("Done mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm ");
		bookingOrderService.saveBookingDetails(bookingOrder);
	return "Booked ticket with id :  " + bookingOrder.getId();
    }
	
	@GetMapping("/{id}")
	public Optional<BookingOrder> getBook(@PathVariable Integer id){
		return bookingOrderService.findById(id);
	}
	
	@GetMapping("/")
	public List<BookingOrder> getBookingDetails(){
		return bookingOrderService.findAll();
	}
	
	@PutMapping("/{id}")
	public BookingOrder updateOrder(@PathVariable("id") Integer id,@RequestBody BookingOrder order ) {
		order.setId(id);
		bookingOrderService.saveBookingDetails(order);
		return order;
	}
	
	
	 @DeleteMapping("/{id}")
	 public String deleteOrder (@PathVariable Integer id) {
	  bookingOrderService.deleteById(id);
		return "Order deleted with id : "+id;
		}

}
