package com.ahmad.maxirail.service;

import com.ahmad.maxirail.model.TrainTime;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class TrainTimeService {
    public List<TrainTime> getTrainTimes() {
        return List.of(
                new TrainTime("A", "B", LocalTime.of(9, 30), LocalTime.of(10, 30)),
                new TrainTime("A", "B", LocalTime.of(15, 30), LocalTime.of(16, 30)),
                new TrainTime("B", "A", LocalTime.of(9, 30), LocalTime.of(10, 30)),
                new TrainTime("B", "A", LocalTime.of(15, 30), LocalTime.of(16, 30))
        );
    }
}
