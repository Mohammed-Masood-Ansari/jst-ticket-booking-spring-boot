package com.jsp.jst_ticket_booking_spring_boot.dao;

import com.jsp.jst_ticket_booking_spring_boot.dto.Admin;

public interface AdminDao {
    Admin findByEmailDao(String email);
    Admin loginAdminWithEmailAndPasswordDao(String email);
}
