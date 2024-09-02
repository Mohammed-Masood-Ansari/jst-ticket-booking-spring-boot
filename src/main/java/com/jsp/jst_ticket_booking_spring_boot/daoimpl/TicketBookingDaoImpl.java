package com.jsp.jst_ticket_booking_spring_boot.daoimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.TicketBookingDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.TicketBooking;
import com.jsp.jst_ticket_booking_spring_boot.repository.TicketBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class TicketBookingDaoImpl implements TicketBookingDao {

    @Autowired
    private TicketBookingRepository ticketBookingRepository;
    @Override
    public TicketBooking saveTicketBookingDao(TicketBooking ticketBooking) {
        Random rnd = new Random();
        long pnr = 1000000000 + rnd.nextLong(900000000);
        ticketBooking.setPnr(pnr);
        return ticketBookingRepository.save(ticketBooking);
    }
}
