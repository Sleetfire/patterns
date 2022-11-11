package generating.builder.default_builder;

import generating.builder.default_builder.api.Builder;

public class Director {

    public void constructPoorPerson(Builder builder) {
        builder.setFirstName("Q");
        builder.setLastName("W");
        builder.setMoneyValue(1000f);
        builder.setCar(false);
        builder.setProperty(true);
    }

    public void constructRichPerson(Builder builder) {
        builder.setFirstName("A");
        builder.setLastName("B");
        builder.setMoneyValue(1000f);
        builder.setCar(true);
        builder.setProperty(true);
    }

}
