package com.jsp.jst_ticket_booking_spring_boot.dao;

import com.jsp.jst_ticket_booking_spring_boot.dto.Customer;

public interface CustomerDao {

    Customer saveCustomerDao(Customer customer);

    Customer findCustomerByEmailDao(String email);

}
