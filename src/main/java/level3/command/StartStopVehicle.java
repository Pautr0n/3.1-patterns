package level3.command;

import level3.model.Vehicle;

public class StartStopVehicle implements Command {

    private final Vehicle vehicle;

    public StartStopVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.switchOnOff();
    }
}
