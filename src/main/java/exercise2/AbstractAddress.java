package exercise2;

public abstract class AbstractAddress implements Address{
    protected String street, number, floor, door, postalCode, city;

    public AbstractAddress(String street, String number, String floor, String door, String postalCode, String city){
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.door = door;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public abstract String getAddress();
}
