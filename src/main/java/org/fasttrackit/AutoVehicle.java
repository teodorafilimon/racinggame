package org.fasttrackit;

public class AutoVehicle extends Vehicle {
    // "has-a" relationship ( de compozitie/de agregare )
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}
