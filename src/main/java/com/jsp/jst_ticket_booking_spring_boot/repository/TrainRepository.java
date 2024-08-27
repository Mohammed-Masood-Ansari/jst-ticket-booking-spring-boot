package com.jsp.jst_ticket_booking_spring_boot.repository;

import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train,Long> {
}
