package com.company.week_12.Car_Repository;

public class Person {
    private final String name;
    private final String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassport_number() {
        return passport_number;
    }

    private final String passport_number;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passport_number='" + passport_number + '\'' +
                '}';
    }

    public Person(String name, String surname, String passport_number) {
        this.name = name;
        this.surname = surname;
        this.passport_number = passport_number;
    }
}
