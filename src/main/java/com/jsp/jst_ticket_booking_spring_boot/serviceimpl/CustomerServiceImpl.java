package com.jsp.jst_ticket_booking_spring_boot.serviceimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.CustomerDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.Customer;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.CustomerService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    private ResponseStructure<Customer> responseStructure;

    private HttpSession httpSession;
    @Override
    public ResponseStructure<Customer> saveCustomerService(Customer customer) {

        Customer customer1 = customerDao.saveCustomerDao(customer);

        if(customer1!=null){
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessgae("cutomer registered");
            customer1.setPassword("**********************");
            responseStructure.setData(customer1);
            return responseStructure;
        }else {
            responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
            responseStructure.setMessgae("cutomer not registered...please check your code");
            customer1.setPassword("**********************");
            responseStructure.setData(customer1);
            return responseStructure;
        }
    }

    @Override
    public ResponseStructure<Customer> loginCustomerWithEmailAndPasswordService(String email, String password) {
       Customer customer = customerDao.findCustomerByEmailDao(email);
        if(customer!=null){

            if(customer.getPassword().equals(password)){
              
                httpSession.setAttribute("customerSession",email);
                httpSession.setMaxInactiveInterval(300);
                responseStructure.setStatusCode(HttpStatus.CONTINUE.value());
                responseStructure.setMessgae("login success go ahead");
                customer.setPassword("*******************");
                responseStructure.setData(customer);

                return  responseStructure;
            }else{
                responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
                responseStructure.setMessgae("login faild...because password is wrong");
                customer.setPassword("*******************");
                responseStructure.setData(customer);
                return  responseStructure;
            }

        }else {

            responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
            responseStructure.setMessgae("login faild...because email is wrong");
            responseStructure.setData(customer);
            return responseStructure;
        }
    }

}
