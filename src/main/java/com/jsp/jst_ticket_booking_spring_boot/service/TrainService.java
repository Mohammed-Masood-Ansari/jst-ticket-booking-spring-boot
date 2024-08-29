package com.jsp.jst_ticket_booking_spring_boot.service;

import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;

import java.util.List;

public interface TrainService {
    ResponseStructure<Train> saveTrainService(Train train);

    ResponseStructure<Train> searchTrainByNumberService(long trainNumber);

    ResponseStructure<List<Train>> searchTrainBySourceAndDestinationService(String source, String destination);
}
