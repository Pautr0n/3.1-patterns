package level2.factory;

public class FactoryLoader {

    public static ContactFactory getFactory(String country) {

        return switch (country) {
            case "ES" -> new SpanishFactory();
            case "FR" -> new FrenchFactory();
            case "US" -> new UsFactory();
            default -> null;
        };

    }

}
