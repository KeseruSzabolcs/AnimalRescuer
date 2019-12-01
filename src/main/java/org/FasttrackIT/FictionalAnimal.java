package org.FasttrackIT;

public class FictionalAnimal extends Animal {
    private boolean doYouSeeIt;


    public FictionalAnimal(String name, int age, int health, int hunger, int happyness, String preferredFood, String preferredGame, boolean doYouSeeIt) {
        super(name, age, health, hunger, happyness, preferredFood, preferredGame);
        this.doYouSeeIt = doYouSeeIt;
    }

    public boolean getDoYouSeeIt() {
        return doYouSeeIt;
    }

    public void setDoYouSeeIt(boolean doYouSeeIt) {
        this.doYouSeeIt = doYouSeeIt;
    }

    @Override
    public void print() {
        if (getDoYouSeeIt()) {
            System.out.println("Yeeey, you can see me, my name is: " + getName());
        } else {
            System.out.println("Sorry but, you can't see me, how can be friends? " + getName());
        }
    }
}
