package com.jsp.jst_ticket_booking_spring_boot.serviceimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.TicketBookingDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.TicketBooking;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {

    @Autowired
    private TicketBookingDao ticketBookingDao;

    @Autowired
    private ResponseStructure<TicketBooking> responseStructure;

    @Override
    public ResponseStructure<TicketBooking> saveTicketBookingService(TicketBooking ticketBooking) {

        TicketBooking ticketBooking1 = ticketBookingDao.saveTicketBookingDao(ticketBooking);

        if(ticketBooking1!=null){

            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessgae("ticket booked success fully");
            responseStructure.setData(ticketBooking);

            return responseStructure;
        }else{

            responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
            responseStructure.setMessgae("!!!!something went wrong!!!!!");
            responseStructure.setData(null);

            return responseStructure;

        }

    }
}
