package org.FasttrackIT;

import java.sql.SQLOutput;

public class Animal extends  Activities{

     //String name;
     int age;
     int health;
     int hunger;
     int happyness;
     String preferredFood;
     String preferredGame;

     public Animal(String name, int age, int health, int hunger, int happyness, String preferredFood, String preferredGame) {
          super(name);
          this.age = age;
          this.health = health;
          this.hunger = hunger;
          this.happyness = happyness;
          this.preferredFood = preferredFood;
          this.preferredGame = preferredGame;
     }
}
