package com.jsp.jst_ticket_booking_spring_boot.serviceimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.AdminDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.Admin;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.AdminService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    Admin admin1 = null;

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private ResponseStructure<Admin> adminResponseStructure;

    @Autowired
    private HttpSession httpSession;

    @Override
    public Admin findByEmailService(String email) {
        return adminDao.findByEmailDao(email);
    }

    @Override
    public ResponseStructure<Admin> loginAdminWithEmailAndPasswordService(String email,String password) {

       Admin admin=adminDao.findByEmailDao(email);

       if(admin!=null){

           if(admin.getPassword().equals(password)){
               admin1=admin;
               httpSession.setAttribute("adminSession",email);
               httpSession.setMaxInactiveInterval(300);
               adminResponseStructure.setStatusCode(HttpStatus.CONTINUE.value());
               adminResponseStructure.setMessgae("login success go ahead");
               admin.setPassword("*******************");
               adminResponseStructure.setData(admin);

               return  adminResponseStructure;
           }else{
               adminResponseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
               adminResponseStructure.setMessgae("login faild...because password is wrong");
               admin.setPassword("*******************");
               adminResponseStructure.setData(admin);
               return  adminResponseStructure;
           }

       }else {

           adminResponseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
           adminResponseStructure.setMessgae("login faild...because email is wrong");
           adminResponseStructure.setData(null);
           return adminResponseStructure;
       }
    }

    @Override
    public ResponseStructure<Admin> LogoutAdminService() {

        if(httpSession.getAttribute("adminSession")!=null){
            httpSession.invalidate();
            System.out.println(httpSession.getLastAccessedTime());
            adminResponseStructure.setStatusCode(HttpStatus.OK.value());
            adminResponseStructure.setMessgae(".....logout successfully....");

            if(admin1!=null){
                admin1.setPassword("*****************************");
                admin1.setId(0000);
            }

            adminResponseStructure.setData(admin1);
            return adminResponseStructure;
        }else{
            adminResponseStructure.setStatusCode(HttpStatus.OK.value());
            adminResponseStructure.setMessgae(".....please login first....");
            adminResponseStructure.setData(admin1);
            return adminResponseStructure;
        }
    }
}
