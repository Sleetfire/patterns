package generating.builder.inner_class_builder;

import generating.builder.inner_class_builder.dto.Person;

public class Demo {
    public static void main(String[] args) {

        Person person = Person.Builder.createBuilder()
                .setFirstName("A")
                .setLastName("B")
                .setMoneyValue(1_000_000_000f)
                .setCar(false)
                .setProperty(true)
                .build();

        System.out.println(person.toString());

    }
}
