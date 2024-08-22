package com.jsp.jst_ticket_booking_spring_boot.serviceimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.AdminDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.Admin;
import com.jsp.jst_ticket_booking_spring_boot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin findByEmailService(String email) {
        return adminDao.findByEmailDao(email);
    }
}
