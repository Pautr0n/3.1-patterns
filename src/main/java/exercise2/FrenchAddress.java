package exercise2;

public class FrenchAddress extends AbstractContactInfo {

    public FrenchAddress(String street, String number, String floor, String door, String postalCode, String city, String phoneNumber) {
        super(street, number, floor, door, postalCode, city, phoneNumber);
    }

    @Override
    public String getAddress() {
        return street + " nº" + number + ", " + floor + "/" + door + ", " + city + "(" + postalCode + ")" + " France";
    }

    @Override
    public String getPhoneNumber() {
        return "+33 " + phoneNumber;
    }
}
