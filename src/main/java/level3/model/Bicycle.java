package level3.model;

public class Bicycle extends Vehicle {

    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void accelerate(int speedIncrease) {
        System.out.println("Increasing legs' power! Lightspeed on!");
        super.accelerate(speedIncrease);
    }

    @Override
    public void brake(int speedDecrease) {
        if (this.getSpeed() > 0) {
            System.out.println("Exiting lightspeed...");
            super.brake(speedDecrease);
        }else{
            System.out.println("Bicycle already stopped....");
        }
    }

    @Override
    public boolean switchOnOff() {
        System.out.println("Nothing happens...");
        return super.switchOnOff();
    }
}
