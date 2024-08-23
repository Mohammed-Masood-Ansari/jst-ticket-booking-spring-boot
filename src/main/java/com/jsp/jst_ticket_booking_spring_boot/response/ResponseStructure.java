package com.jsp.jst_ticket_booking_spring_boot.response;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResponseStructure<T> {

    private int statusCode;
    private String messgae;
    private T data;


}
