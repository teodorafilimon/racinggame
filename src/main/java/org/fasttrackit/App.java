package org.fasttrackit;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{

    // one line comment

    public static void main( String[] args )
    { Engine engine = new Engine();

        System.out.println( "Welcome to the racing game" );
        //instance variables
        Engine carEngine = new Engine ();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;


       Car carReference = new Car(carEngine);
       carReference.name = "Dacia";
       carReference.color = "red";
       carReference.mileage = 9.8;
       carReference.fuelLevel = 60;
       carReference.maxSpeed = 200;
       carReference.running = false;
       carReference.doorCount= 2;


        System.out.println("Engine Details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);

        double accelerationdistance = carReference.accelerate(60,1) ;
        System.out.println("Acceleration distance: "+ accelerationdistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println("Total traveled distance after repair :" + carReference.traveledDistance);

        Engine car2Engine = new Engine ();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 2;


       Car car2 = new Car(car2Engine);
       car2.name = "BMW";
       car2.mileage = 14;
//concanetaton
        System.out.println(carReference);
        System.out.println("First car name: " + carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.traveledDistance);
        System.out.println(carReference.running);


        System.out.println("Second car name: " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.traveledDistance);
        System.out.println(car2.running);

        car2.name = "VW";
        System.out.println(car2.name);

        Car car3 = car2;
        car3.name = "Audi";

        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car3 name:" + car3.name);

        Car car4 = null;
//        System.out.println(car4.name);


//        System.out.println("Modulo example:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//        System.out.println(4 % 2 == 0);
        System.out.println( "Studying class variables (static variables) ...");
        Vehicle vehicle1 = new Vehicle();
        Vehicle.totalCount = 10;
        Vehicle vehicle2 = new Vehicle();
        Vehicle.totalCount= 20;
        Vehicle.totalCount = 30;
        System.out.println("Total vehicle count from vehicle1 : " + vehicle1.totalCount);
        System.out.println("Total vehicle count from vehicle2 : " + vehicle2.totalCount);
        System.out.println("Total vehicle count from Vehicle class : " + Vehicle.totalCount);






    }

}
