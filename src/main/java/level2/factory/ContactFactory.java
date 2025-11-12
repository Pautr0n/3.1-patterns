package level2.factory;

import level2.model.ContactInfo;

public interface ContactFactory {

    ContactInfo createContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber);

}
