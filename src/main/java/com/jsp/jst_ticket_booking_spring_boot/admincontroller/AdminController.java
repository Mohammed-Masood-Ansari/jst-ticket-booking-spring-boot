package com.jsp.jst_ticket_booking_spring_boot.admincontroller;

import com.jsp.jst_ticket_booking_spring_boot.dto.Admin;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.AdminService;
import lombok.val;
import org.aspectj.internal.lang.annotation.ajcDeclareParents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "fetchAdminByEmail/{email}")
    public Admin findByEmailController(@PathVariable String email) {
        return adminService.findByEmailService(email);
    }

    @GetMapping(value = "/loginAdminWithEmailAndPassword/{email}/{password}")
    public ResponseStructure<Admin> loginAdminWithEmailAndPasswordController(@PathVariable String email, @PathVariable String password) {
        return adminService.loginAdminWithEmailAndPasswordService(email,password);
    }


    @GetMapping(value = "/logoutAdmin")
    public ResponseStructure<Admin> LogoutAdminController() {
        return adminService.LogoutAdminService();
    }
}
