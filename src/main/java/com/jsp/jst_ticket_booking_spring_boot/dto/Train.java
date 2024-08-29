package com.jsp.jst_ticket_booking_spring_boot.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {

    @Id
    @Column(name = "trainnumber")
    private long trainNumber;

    @Column(name = "trainname")
    private String trainName;

    private String source;

    private String destination;

    @Column(name = "departuretime")
    private LocalTime departureTime;

    @Column(name = "arrivaltime")
    private LocalTime arrivalTime;

    private int duration;

    private String departureDay;

    private String arrivalDay;

}
