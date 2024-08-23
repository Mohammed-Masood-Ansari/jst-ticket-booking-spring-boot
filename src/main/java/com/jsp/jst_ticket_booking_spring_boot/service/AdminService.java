package com.jsp.jst_ticket_booking_spring_boot.service;

import com.jsp.jst_ticket_booking_spring_boot.dto.Admin;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;

public interface AdminService {
    Admin findByEmailService(String email);

    ResponseStructure<Admin> loginAdminWithEmailAndPasswordService(String email,String password);

    ResponseStructure<Admin> LogoutAdminService();
}
