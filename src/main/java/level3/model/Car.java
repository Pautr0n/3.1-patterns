package level3.model;

public class Car extends Vehicle {

    public Car(String model) {
        super(model);
    }

    @Override
    public void accelerate(int speedIncrease) {
        if (this.getIsOn()) {
            System.out.println("Speeding up the car by: " + speedIncrease);
            super.accelerate(speedIncrease);
        } else {
            System.out.println("Please switch on the car");
        }
    }

    @Override
    public void brake(int speedDecrease) {

        if (!this.getIsOn()) {
            System.out.println("Cannot decrease speed, engine must be on");
        } else if (this.getSpeed() > 0) {
            System.out.println("Slowing down the car by: " + speedDecrease);
        } else {
            System.out.println("Car is already stopped.");
        }

    }

    @Override
    public boolean switchOnOff() {
        if (!this.getIsOn()) {
            System.out.println("Car's engine ready. Brrrum Brruum");
        } else {
            System.out.println("Car's engine stopped.");
        }
        return super.switchOnOff();
    }

}
