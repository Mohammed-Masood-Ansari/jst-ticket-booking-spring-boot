package com.jsp.jst_ticket_booking_spring_boot.service;

import com.jsp.jst_ticket_booking_spring_boot.dto.Admin;

public interface AdminService {
    Admin findByEmailService(String email);
}
