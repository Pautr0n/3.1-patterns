package level2.model;

public class FrenchContactInfo extends AbstractContactInfo {

    public FrenchContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber) {
        super(name, surname, street, postalCode, city, phoneNumber);
    }

    @Override
    public String getAddress() {
        return surname + " " + name + " | " + street + ", " + city + " (" + postalCode + ")" + " France";
    }

    @Override
    public String getPhoneNumber() {
        return "+33 " + phoneNumber;
    }

    @Override
    public String getSurname() {
        return surname;
    }

}
