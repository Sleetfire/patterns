package generating.builder.default_builder;

import generating.builder.default_builder.api.Builder;
import generating.builder.default_builder.dto.Person;

public class RichPersonBuilder implements Builder {

    private String firstName;
    private String lastName;
    private float moneyValue;
    private boolean isCar;
    private boolean isProperty;

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setMoneyValue(float moneyValue) {
        this.moneyValue = moneyValue * 100_000;
    }

    @Override
    public void setCar(boolean car) {
        this.isCar = true;
    }

    @Override
    public void setProperty(boolean property) {
        this.isProperty = true;
    }

    public Person create() {
        return new Person(this.firstName, this.lastName, this.moneyValue, this.isCar, this.isProperty);
    }
}
