package generating.builder.inner_class_builder.dto;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private float moneyValue;
    private boolean isCar;
    private boolean isProperty;

    private Person(String firstName, String lastName, float moneyValue, boolean isCar, boolean isProperty) {
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
        Person person = (Person) o;
        return Float.compare(person.moneyValue, moneyValue) == 0
                && isCar == person.isCar
                && isProperty == person.isProperty
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
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

    public static class Builder {
        private String firstName;
        private String lastName;
        private float moneyValue;
        private boolean isCar;
        private boolean isProperty;

        private Builder() {

        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMoneyValue(float moneyValue) {
            this.moneyValue = moneyValue;
            return this;
        }

        public Builder setCar(boolean car) {
            isCar = car;
            return this;
        }

        public Builder setProperty(boolean property) {
            isProperty = property;
            return this;
        }

        public Person build() {
            return new Person(this.firstName, this.lastName, this.moneyValue, this.isCar, this.isProperty);
        }
    }
}
