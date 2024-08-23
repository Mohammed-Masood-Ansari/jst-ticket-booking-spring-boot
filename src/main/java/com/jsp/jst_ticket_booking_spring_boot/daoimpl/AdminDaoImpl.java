package com.jsp.jst_ticket_booking_spring_boot.daoimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.AdminDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.Admin;
import com.jsp.jst_ticket_booking_spring_boot.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl implements AdminDao {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin findByEmailDao(String email) {
        return adminRepository.findByEmail(email);
    }

    @Override
    public Admin loginAdminWithEmailAndPasswordDao(String email) {
        return adminRepository.findByEmail(email);
    }
}
