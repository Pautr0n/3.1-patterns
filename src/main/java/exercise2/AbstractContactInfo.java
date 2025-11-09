package exercise2;

public abstract class AbstractContactInfo implements ContactInfo {
    protected String street, number, floor, door, postalCode, city, phoneNumber;

    public AbstractContactInfo(String street, String number, String floor, String door, String postalCode, String city, String phoneNumber){
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.door = door;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public abstract String getAddress();

    @Override
    public abstract String getPhoneNumber();

}
