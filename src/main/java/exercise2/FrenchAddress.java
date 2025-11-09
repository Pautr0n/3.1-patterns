package exercise2;

public class FrenchAddress extends AbstractAddress{

    public FrenchAddress(String street, String number, String floor, String door, String postalCode, String city) {
        super(street, number, floor, door, postalCode, city);
    }

    @Override
    public String getAddress() {
        return street + " nº" + number + ", " + floor + "/" + door + ", " + city + "(" + postalCode + ")" + " France";
    }
}
