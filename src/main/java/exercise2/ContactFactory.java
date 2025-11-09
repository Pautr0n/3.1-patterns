package exercise2;

public interface ContactFactory {

    ContactInfo createContactInfo(String name, String surname, String street, String number, String floor, String door, String postalCode, String city, String phoneNumber);

}
