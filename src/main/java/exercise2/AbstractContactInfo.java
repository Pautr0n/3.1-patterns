package exercise2;

public abstract class AbstractContactInfo implements ContactInfo {
    protected String name, surname, street, number, floor, door, postalCode, city, phoneNumber;

    public AbstractContactInfo(String name, String surname, String street, String number, String floor, String door, String postalCode, String city, String phoneNumber) {

        this.name =  name;
        this.surname = surname;
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
