package level2.factory;

import level2.model.ContactInfo;
import level2.model.FrenchContactInfo;

public class FrenchFactory implements ContactFactory {

    @Override
    public ContactInfo createContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber) {
        return new FrenchContactInfo(name, surname, street, postalCode, city, phoneNumber);
    }

}
