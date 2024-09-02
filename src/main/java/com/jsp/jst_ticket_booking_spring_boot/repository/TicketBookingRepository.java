package com.jsp.jst_ticket_booking_spring_boot.repository;

import com.jsp.jst_ticket_booking_spring_boot.dto.TicketBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketBookingRepository extends JpaRepository<TicketBooking,Long> {
}
