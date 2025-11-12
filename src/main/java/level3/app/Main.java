package level3.app;

import level3.command.BrakeVehicle;
import level3.command.AccelerateVehicle;
import level3.command.StartStopVehicle;
import level3.invoker.Driver;
import level3.model.Airplane;
import level3.model.Bicycle;
import level3.model.Car;
import level3.model.CruiseShip;

public class Main {
    public static void main(String[] args){

        Airplane airplane = new Airplane("Airbus A380");
        System.out.println(airplane);
        Car car = new Car("Citroen C15");
        System.out.println(car);
        Bicycle bicycle = new Bicycle("Torrot");
        System.out.println(bicycle);
        CruiseShip cruiseShip = new CruiseShip("Princess of the seas");
        System.out.println(cruiseShip);

        StartStopVehicle startStopAirplane = new StartStopVehicle(airplane);
        StartStopVehicle startStopCar = new StartStopVehicle(car);
        StartStopVehicle startStopBicycle = new StartStopVehicle(bicycle);
        StartStopVehicle startStopCruise = new StartStopVehicle(cruiseShip);
        AccelerateVehicle speedUpAirplane = new AccelerateVehicle(airplane, 300);
        AccelerateVehicle speedUpCar = new AccelerateVehicle(car, 150);
        AccelerateVehicle speedUpBicycle = new AccelerateVehicle(bicycle, 20);
        AccelerateVehicle speedUpCruise = new AccelerateVehicle(cruiseShip, 100);
        BrakeVehicle slowDownAirplane = new BrakeVehicle(airplane, 150);
        BrakeVehicle slowDownCar = new BrakeVehicle(car, 150);
        BrakeVehicle slowDownBicycle = new BrakeVehicle(bicycle, 10);
        BrakeVehicle slowDownCruise = new BrakeVehicle(cruiseShip, 99);

        Driver driver = new Driver();

        driver.useVehicle(startStopAirplane);
        driver.useVehicle(startStopCar);
        driver.useVehicle(startStopBicycle);
        driver.useVehicle(startStopCruise);


        driver.useVehicle(speedUpAirplane);
        driver.useVehicle(speedUpBicycle);
        driver.useVehicle(speedUpCar);
        driver.useVehicle(speedUpCruise);

        driver.useVehicle(slowDownAirplane);
        driver.useVehicle(slowDownCar);
        driver.useVehicle(slowDownBicycle);
        driver.useVehicle(slowDownCruise);


    }

}
