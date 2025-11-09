package exercise2;

public class UsContactInfo extends AbstractContactInfo {

    public UsContactInfo(String name, String surname, String street, String number, String floor, String door, String postalCode, String city, String phoneNumber) {
        super(name, surname, street, number, floor, door, postalCode, city, phoneNumber);
    }

    @Override
    public String getAddress() {
        return surname + " " + name + " | " + "Number: " + number + " of " + street + "floor: " + floor + ", door: " + door + ", zip: " + postalCode + ", city: " + city + "-  USA";
    }

    @Override
    public String getPhoneNumber() {
        return "+1 " + phoneNumber;
    }
}
