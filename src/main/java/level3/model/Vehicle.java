package level3.model;
// es el template del que hace el request.
public abstract class Vehicle {

    private String model;
    private int speed = 0;
    private boolean isOn = false;

    public Vehicle(String model){
        this.model = model;
    }

    public void accelerate(int speedIncrease){
        speed += speedIncrease;
        System.out.println("New speed " + speed);
    }

    public void brake(int speedDecrease){
        speed -= speedDecrease;
        System.out.println("New speed " + speed);
    }

    public boolean switchOnOff(){
        isOn = !isOn;
        return isOn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }


    public boolean getIsOn(){
        return isOn;
    }

    @Override
    public String toString() {
        return model +
                " has a speed of " + speed +
                ", and engine is on: " + isOn +
                '}';
    }
}
