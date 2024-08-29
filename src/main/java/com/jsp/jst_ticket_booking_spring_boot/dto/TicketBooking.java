package com.jsp.jst_ticket_booking_spring_boot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TicketBooking {

    @Id
    private long pnr;
    private String passengerName;
    private int passengerAge;
    private String gender;
    private LocalDate journeyDate;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Train train;

}
