package generating.builder.default_builder;

import generating.builder.default_builder.api.Builder;
import generating.builder.default_builder.dto.Person;

public class PoorPersonBuilder implements Builder {

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
        this.moneyValue = 0;
    }

    @Override
    public void setCar(boolean car) {
        this.isCar = false;
    }

    @Override
    public void setProperty(boolean property) {
        this.isProperty = false;
    }

    public Person create() {
        return new Person(this.firstName, this.lastName, this.moneyValue, this.isCar, this.isProperty);
    }
}
