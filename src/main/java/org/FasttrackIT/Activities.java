package org.FasttrackIT;

public class Activities {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activities(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    public void feed(Food food, Animal animal){
        System.out.println(getName() + " just gave " + food.getName() + " to " + animal.getName());
        animal.setHappyness(animal.getHappyness()-1);
            System.out.println("Animal happiness level " + animal.getHappyness());
        }


    public void acctivity(Activities activities, Animal animal){
        System.out.println(getName() + " is playing " + activities.getName() + " with " + animal.getName());
        animal.setHappyness(animal.getHappyness()+1);
        System.out.println("Animal happiness level " + animal.getHappyness());
    }
}
