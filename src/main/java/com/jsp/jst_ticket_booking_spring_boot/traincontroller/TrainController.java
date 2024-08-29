package com.jsp.jst_ticket_booking_spring_boot.traincontroller;

import com.jsp.jst_ticket_booking_spring_boot.dto.Train;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.TrainService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/train")
public class TrainController {

    private TrainService trainService;

    @PostMapping(value = "/saveTrain")
    public ResponseStructure<Train> saveTrainService(@RequestBody Train train){
        return trainService.saveTrainService(train);
    }
}
