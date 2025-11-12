package level3.command;

import level3.model.Vehicle;

public class BrakeVehicle implements Command {
    private final Vehicle vehicle;
    private int speedDecreae;

    public BrakeVehicle(Vehicle vehicle, int speedDecrease) {
        this.vehicle = vehicle;
        this.speedDecreae = speedDecrease;
    }


    @Override
    public void execute() {
        vehicle.brake(speedDecreae);
    }
}
