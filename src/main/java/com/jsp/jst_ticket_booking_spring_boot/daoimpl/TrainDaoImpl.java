package com.jsp.jst_ticket_booking_spring_boot.daoimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.TrainDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import com.jsp.jst_ticket_booking_spring_boot.repository.TrainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TrainDaoImpl implements TrainDao {

    private TrainRepository trainRepository;

    @Override
    public Train saveTrainDao(Train train) {
        return trainRepository.save(train);
    }

    @Override
    public Train searchTrainByNumberDao(long trainNumber) {
        return trainRepository.findByTrainNumber(trainNumber);
    }

    @Override
    public List<Train> searchTrainBySourceAndDestinationDao(String source, String destination) {
        return trainRepository.findBySourceAndDestination(source,destination);
    }
}
