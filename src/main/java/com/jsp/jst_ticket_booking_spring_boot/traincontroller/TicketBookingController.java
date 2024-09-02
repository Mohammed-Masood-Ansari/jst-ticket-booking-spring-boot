package com.jsp.jst_ticket_booking_spring_boot.traincontroller;

import com.jsp.jst_ticket_booking_spring_boot.dto.TicketBooking;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ticketBooking")
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @PostMapping(value = "/saveTicket")
    public ResponseStructure<TicketBooking> saveTicketBookingService(@RequestBody TicketBooking ticketBooking) {
        return ticketBookingService.saveTicketBookingService(ticketBooking);
    }
}
