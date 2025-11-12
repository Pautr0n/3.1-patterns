package level3.invoker;

import level3.command.Command;

public class Driver {

    public void useVehicle(Command command) {
        command.execute();
    }

}
