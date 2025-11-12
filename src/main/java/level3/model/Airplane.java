package level3.model;

public class Airplane extends Vehicle {


    public Airplane(String model) {
        super(model);
    }

    @Override
    public void accelerate(int speedIncrease) {
        if (this.getIsOn()) {
            System.out.println("Increasing turbofan engine power, accelerating by " + speedIncrease);
            super.accelerate(speedIncrease);
        } else {
            System.out.println("Please switch on the turbofan engine first.");
        }

    }

    @Override
    public void brake(int speedDecrease) {

        if (!this.getIsOn()) {
            System.out.println("Cannot brake, engine must be on");
        } else if (this.getSpeed() > 0) {
            System.out.println("Decreasing turbofan engine power, reducing speed by: " + speedDecrease);
        } else {
            System.out.println("Airplane already stopped.");
        }

    }

    @Override
    public boolean switchOnOff() {

        if (!this.getIsOn()) {
            System.out.println("Turbofan engine switched on. Ready to take off");
        } else {
            System.out.println("Turbofan engine switched off.");
        }
        return super.switchOnOff();
    }
}
