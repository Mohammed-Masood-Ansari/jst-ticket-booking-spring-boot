package com.jsp.jst_ticket_booking_spring_boot.dao;

import com.jsp.jst_ticket_booking_spring_boot.dto.Train;

import java.util.List;

public interface TrainDao {

    Train saveTrainDao(Train train);

    Train searchTrainByNumberDao(long trainNumber);

    List<Train> searchTrainBySourceAndDestinationDao(String source,String destination);
}
