package com.jsp.jst_ticket_booking_spring_boot.service;

import com.jsp.jst_ticket_booking_spring_boot.dto.TicketBooking;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;

public interface TicketBookingService {

    ResponseStructure<TicketBooking> saveTicketBookingService(TicketBooking ticketBooking);
}
