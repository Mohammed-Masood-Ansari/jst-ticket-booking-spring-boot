package com.jsp.jst_ticket_booking_spring_boot.daoimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.TrainDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import com.jsp.jst_ticket_booking_spring_boot.repository.TrainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TrainDaoImpl implements TrainDao {

    private TrainRepository trainRepository;

    @Override
    public Train saveTrainDao(Train train) {
        return trainRepository.save(train);
    }
}
