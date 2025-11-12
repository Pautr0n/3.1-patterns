package level2.model;

public class UsContactInfo extends AbstractContactInfo {

    public UsContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber) {
        super(name, surname, street, postalCode, city, phoneNumber);
    }

    @Override
    public String getAddress() {
        return surname + " " + name + " | " + street + ", zip: " + postalCode + ", city: " + city + " -  USA";
    }

    @Override
    public String getPhoneNumber() {
        return "+1 " + phoneNumber;
    }

    @Override
    public String getSurname() {
        return surname;
    }
}
