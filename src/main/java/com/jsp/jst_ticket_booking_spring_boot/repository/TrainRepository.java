package com.jsp.jst_ticket_booking_spring_boot.repository;

import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainRepository extends JpaRepository<Train,Long> {
    public Train findByTrainNumber(long trainNumber);

    public List<Train> findBySourceAndDestination(String source,String destination);
}
