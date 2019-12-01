package org.FasttrackIT;

public class WildAnimal extends Animal {
    private boolean adoptable;

    public WildAnimal(String name, int age, int health, int hunger, int happyness, String preferredFood, String preferredGame, boolean adoptable) {
        super(name, age, health, hunger, happyness, preferredFood, preferredGame);
        this.adoptable = adoptable;

    }

    public boolean getAdoptable() {

        return adoptable;
    }

    public void setAdoptable(boolean adoptable) {

        this.adoptable = adoptable;
    }

    @Override
    public void print() {
        if (getAdoptable()) {
            System.out.println("Even I can be adopted, my name is: " + getName());
        } else {
            System.out.println("Sorry I can't be adopted, but my name is: " + getName());
        }
    }
}
