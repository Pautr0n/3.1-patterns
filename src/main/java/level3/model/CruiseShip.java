package level3.model;

public class CruiseShip extends Vehicle {

    public CruiseShip(String model) {
        super(model);
    }

    @Override
    public void accelerate(int speedIncrease) {
        if (this.getIsOn()){
            System.out.println("Increasing Diesel Engine power. Ship's speed increasing by: " + speedIncrease);
            super.accelerate(speedIncrease);
        }else {
            System.out.println("Please switch on Diesel Engine first.");
        }

    }

    @Override
    public void brake(int speedDecrease) {

        if(!this.getIsOn()){
            System.out.println("Cannot decrease speed, engine must be on");
        }else if(this.getSpeed() > 0){
            System.out.println("Reducing Diesel Engine power, reducing speed by: " + speedDecrease);
        }else {
            System.out.println("Ship is already stopped.");
        }

    }

    @Override
    public boolean switchOnOff() {
        return super.switchOnOff();
    }
}
