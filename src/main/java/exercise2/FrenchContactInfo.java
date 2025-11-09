package exercise2;

public class FrenchContactInfo extends AbstractContactInfo {

    public FrenchContactInfo(String name, String surname, String street, String number, String floor, String door, String postalCode, String city, String phoneNumber) {
        super(name, surname, street, number, floor, door, postalCode, city, phoneNumber);
    }

    @Override
    public String getAddress() {
        return surname + " " + name + " | " + street + " nº" + number + ", " + floor + "/" + door + ", " + city + "(" + postalCode + ")" + " France";
    }

    @Override
    public String getPhoneNumber() {
        return "+33 " + phoneNumber;
    }
}
