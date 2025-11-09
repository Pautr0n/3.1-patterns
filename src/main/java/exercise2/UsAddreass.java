package exercise2;

public class UsAddreass extends AbstractContactInfo {

    public UsAddreass(String street, String number, String floor, String door, String postalCode, String city) {
        super(street, number, floor, door, postalCode, city);
    }

    @Override
    public String getAddress() {
        return "Number: " + number + " of " + street + "floor: " + floor + ", door: " + door + ", zip: " + postalCode + ", city: " + city + "-  USA";
    }
}
