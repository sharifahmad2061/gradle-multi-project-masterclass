package com.ahmad.maxirail.model;

import java.time.LocalTime;

public record TrainTime(
        String departureStation,
        String arrivalStation,
        LocalTime departureTime,
        LocalTime arrivalTime
) {
}
