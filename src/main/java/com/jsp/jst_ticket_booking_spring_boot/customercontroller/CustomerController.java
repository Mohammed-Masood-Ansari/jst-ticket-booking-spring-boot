package com.jsp.jst_ticket_booking_spring_boot.customercontroller;


import com.jsp.jst_ticket_booking_spring_boot.dto.Customer;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping(value = "/customer")
@AllArgsConstructor
public class CustomerController {


    private CustomerService customerService;

    @PostMapping(value = "/register")
    public ResponseStructure<Customer> saveCustomerService(@RequestBody Customer customer) {
        return customerService.saveCustomerService(customer);
    }

    @GetMapping(value = "/login/{email}/{password}")
    public ResponseStructure<Customer> loginCustomerWithEmailAndPasswordService(@PathVariable String email, @PathVariable String password) {
       return customerService.loginCustomerWithEmailAndPasswordService(email,password);
    }

}

