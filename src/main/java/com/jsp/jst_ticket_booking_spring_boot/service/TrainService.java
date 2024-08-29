package com.jsp.jst_ticket_booking_spring_boot.service;

import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;

public interface TrainService {
    ResponseStructure<Train> saveTrainService(Train train);
}
