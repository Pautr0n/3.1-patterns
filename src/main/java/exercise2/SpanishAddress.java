package exercise2;

public class SpanishAddress extends AbstractContactInfo {


    public SpanishAddress(String street, String number, String floor, String door, String postalCode, String city, String phoneNumber) {
        super(street, number, floor, door, postalCode, city, phoneNumber);
    }

    @Override
    public String getAddress() {
        return street + " " + number + ", " + floor + "-" + door + ", " + postalCode + "(" + city + ")" + " Spain";
    }

    @Override
    public String getPhoneNumber() {
        return "+34 " + phoneNumber;
    }
}
