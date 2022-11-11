package generating.builder.default_builder.dto;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private float moneyValue;
    private boolean isCar;
    private boolean isProperty;

    public Person(String firstName, String lastName, float moneyValue, boolean isCar, boolean isProperty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.moneyValue = moneyValue;
        this.isCar = isCar;
        this.isProperty = isProperty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getMoneyValue() {
        return moneyValue;
    }

    public void setMoneyValue(float moneyValue) {
        this.moneyValue = moneyValue;
    }

    public boolean isCar() {
        return isCar;
    }

    public void setCar(boolean car) {
        isCar = car;
    }

    public boolean isProperty() {
        return isProperty;
    }

    public void setProperty(boolean property) {
        isProperty = property;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return Float.compare(that.moneyValue, moneyValue) == 0
                && isCar == that.isCar
                && isProperty == that.isProperty
                && Objects.equals(firstName, that.firstName)
                && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, moneyValue, isCar, isProperty);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", moneyValue=" + moneyValue +
                ", isCar=" + isCar +
                ", isProperty=" + isProperty +
                '}';
    }
}
