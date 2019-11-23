package org.FasttrackIT;

public class WildAnimal extends Animal{
    private String adoptable;

    public String getAdoptable() {
        return adoptable;
    }

    public void setAdoptable(String adoptable) {
        this.adoptable = adoptable;
    }

    public WildAnimal(String name, int age, int health, int hunger, int happyness, String preferredFood, String preferredGame, String adoptable) {
        super(name, age, health, hunger, happyness, preferredFood, preferredGame);
    }
    public void print() {
        System.out.println("Even I can be adopted, my name is: " + getName());
    }
}
