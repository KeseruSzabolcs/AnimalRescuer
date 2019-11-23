package org.FasttrackIT;

public class FictionalAnimal extends Animal {
    public FictionalAnimal(String name, int age, int health, int hunger, int happyness, String preferredFood, String preferredGame) {
        super(name, age, health, hunger, happyness, preferredFood, preferredGame);
    }

    @Override
    public void print() {
        System.out.println("Let's keep this our secret, my name is: " + getName());
    }
}
