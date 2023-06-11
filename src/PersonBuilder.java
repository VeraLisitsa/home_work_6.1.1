import java.util.OptionalInt;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected boolean hasAge;
    protected String address;

    public PersonBuilder() {

    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        this.hasAge = true;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Некорректное значение возраста");
        }
        if (name == null || surname == null) {
            throw new IllegalStateException();
        }
        Person person;
        if (hasAge) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }

        if (address != null) {
            person.setAddress(address);
        }

        return person;
    }
}
