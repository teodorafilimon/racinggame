package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

public class Vehicle  {
    // instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    LocalDate createdDate = LocalDate.now() .minusWeeks(2);

}
