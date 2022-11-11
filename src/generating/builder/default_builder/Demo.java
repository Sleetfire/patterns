package generating.builder.default_builder;

import generating.builder.default_builder.dto.Person;

public class Demo {
    public static void main(String[] args) {

        Director director = new Director();

        PoorPersonBuilder poorPersonBuilder = new PoorPersonBuilder();
        RichPersonBuilder richPersonBuilder = new RichPersonBuilder();

        director.constructPoorPerson(poorPersonBuilder);
        director.constructRichPerson(richPersonBuilder);

        Person poorPerson = poorPersonBuilder.create();
        Person richPerson = richPersonBuilder.create();

        System.out.println(poorPerson.toString());
        System.out.println(richPerson.toString());

    }
}
