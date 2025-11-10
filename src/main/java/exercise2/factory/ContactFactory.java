package exercise2.factory;

import exercise2.model.ContactInfo;

public interface ContactFactory {

    ContactInfo createContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber);

}
