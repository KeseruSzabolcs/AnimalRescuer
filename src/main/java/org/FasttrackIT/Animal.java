package org.FasttrackIT;

import java.sql.SQLOutput;

public class Animal {

    private String name;
    private int age;
    private int health;
    private int hunger;
    private int happyness;
    private String preferredFood;
    private String preferredGame;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappyness() {
        return happyness;
    }

    public void setHappyness(int happyness) {
        this.happyness = happyness;
    }

    public String getPreferredFood() {
        return preferredFood;
    }

    public void setPreferredFood(String preferredFood) {
        this.preferredFood = preferredFood;
    }

    public String getPreferredGame() {
        return preferredGame;
    }

    public void setPreferredGame(String preferredGame) {
        this.preferredGame = preferredGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, int age, int health, int hunger, int happyness, String preferredFood, String preferredGame) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.hunger = hunger;
        this.happyness = happyness;
        this.preferredFood = preferredFood;
        this.preferredGame = preferredGame;
    }
    public Animal(){
    }

    public void print() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", hunger=" + hunger +
                ", happyness=" + happyness +
                ", preferredFood='" + preferredFood + '\'' +
                ", preferredGame='" + preferredGame + '\'' +
                '}';
    }
}
