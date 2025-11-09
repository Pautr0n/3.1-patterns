package exercise2;

public class SpanishContactInfo extends AbstractContactInfo {


    public SpanishContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber) {
        super(name, surname, street, postalCode, city, phoneNumber);
    }

    @Override
    public String getAddress() {
        return surname + " " + name + " | " + street  +"," + postalCode + " (" + city + ")" + " Spain";
    }

    @Override
    public String getPhoneNumber() {
        return "+34 " + phoneNumber;
    }

    @Override
    public String getSurname() {
        return surname;
    }
}
