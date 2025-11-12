package level2.model;

public abstract class AbstractContactInfo implements ContactInfo {
    protected String name, surname, street, postalCode, city, phoneNumber;

    public AbstractContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber) {

        this.name = name;
        this.surname = surname;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public abstract String getAddress();

    @Override
    public abstract String getPhoneNumber();

    @Override
    public abstract String getSurname();
}
