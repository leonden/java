package ch.coop.unittesting.models;

import ch.coop.unittesting.enums.Gender;

public class Penguin extends Bird {

    public Penguin(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public String sing() {
        return "I'm a penguin and my name is " + getName();
    }
}
