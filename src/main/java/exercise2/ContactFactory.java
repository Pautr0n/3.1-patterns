package exercise2;

public interface ContactFactory {

    ContactInfo createContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber);

}
