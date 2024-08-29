package com.jsp.jst_ticket_booking_spring_boot.serviceimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.TrainDao;
import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.TrainService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrainServiceImpl implements TrainService {

    private TrainDao trainDao;

    private HttpSession httpSession;

    private ResponseStructure<Train> responseStructure;

    private ResponseStructure<List<Train>> structure;
    @Override
    public ResponseStructure<Train> saveTrainService(Train train) {
        if(httpSession.getAttribute("adminSession")!=null){
            Train train1=trainDao.saveTrainDao(train);
            if(train1!=null){
                responseStructure.setStatusCode(HttpStatus.CREATED.value());
                responseStructure.setMessgae("train registered!!!!");
                responseStructure.setData(train1);
                return responseStructure;
            }else {
                responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
                responseStructure.setMessgae("train not registered!!!!something went wrong");
                responseStructure.setData(null);
                return responseStructure;
            }
        }else{
            responseStructure.setStatusCode(HttpStatus.UNAUTHORIZED.value());
            responseStructure.setMessgae("please loggin with admin and then add train details");
            responseStructure.setData(null);
            return responseStructure;
        }
    }

    @Override
    public ResponseStructure<Train> searchTrainByNumberService(long trainNumber) {

            Train train1=trainDao.searchTrainByNumberDao(trainNumber);
            if(train1!=null){
                responseStructure.setStatusCode(HttpStatus.FOUND.value());
                responseStructure.setMessgae("train details!!!!");
                responseStructure.setData(train1);
                return responseStructure;
            }else {
                responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
                responseStructure.setMessgae("train number is invalid");
                responseStructure.setData(null);
                return responseStructure;
            }
    }

    @Override
    public ResponseStructure<List<Train>> searchTrainBySourceAndDestinationService(String source, String destination) {

        List<Train> trains=trainDao.searchTrainBySourceAndDestinationDao(source,destination);

        if(!trains.isEmpty()){
            structure.setStatusCode(HttpStatus.FOUND.value());
            structure.setMessgae("train details are!!!!");
            structure.setData(trains);
            return structure;
        }else{
            structure.setStatusCode(HttpStatus.NOT_FOUND.value());
            structure.setMessgae("given source and destination trains are not available!!!");
            structure.setData(null);
            return structure;
        }
    }
}
