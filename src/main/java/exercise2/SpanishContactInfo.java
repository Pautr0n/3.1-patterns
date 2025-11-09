package exercise2;

public class SpanishContactInfo extends AbstractContactInfo {


    public SpanishContactInfo(String name, String surname, String street, String number, String floor, String door, String postalCode, String city, String phoneNumber) {
        super(name, surname, street, number, floor, door, postalCode, city, phoneNumber);
    }

    @Override
    public String getAddress() {
        return surname + " " + name + " | " + street + " " + number + ", " + floor + "-" + door + ", " + postalCode + "(" + city + ")" + " Spain";
    }

    @Override
    public String getPhoneNumber() {
        return "+34 " + phoneNumber;
    }
}
