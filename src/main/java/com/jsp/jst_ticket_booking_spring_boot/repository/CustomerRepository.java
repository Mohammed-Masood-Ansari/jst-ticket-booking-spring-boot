package com.jsp.jst_ticket_booking_spring_boot.repository;

import com.jsp.jst_ticket_booking_spring_boot.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
    Customer findByEmail(String email);
}
