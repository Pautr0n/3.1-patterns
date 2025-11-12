package level3.command;

import level3.model.Vehicle;

public class AccelerateVehicle implements Command {
    private Vehicle vehicle;
    private int speedIncrease;

    public AccelerateVehicle(Vehicle vehicle, int speedIncrease){
        this.vehicle = vehicle;
        this.speedIncrease = speedIncrease;
    }

    @Override
    public void execute() {
        vehicle.accelerate(speedIncrease);
    }
}
