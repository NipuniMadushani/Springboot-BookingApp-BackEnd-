package com.dmsswt.BookingOrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmsswt.BookingOrderService.model.BookingOrder;

@Repository
public interface BookingOrderRepository extends JpaRepository<BookingOrder, Integer> {

}
