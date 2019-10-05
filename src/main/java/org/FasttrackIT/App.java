package org.FasttrackIT;


import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Leno";
        animal1.age = 14;
        animal1.hunger = 10;
        animal1.health = 10;
        animal1.happyness = 10;
        animal1.preferredFood = "Dog Food";
        animal1.preferredGame = "Ball game";

        Adaptor adaptor = new Adaptor();
        adaptor.name = "John";
        adaptor.moneyAvaliable = 29.4;

        Food food = new Food();
        food.InStoc = 6;
        food.name = "Pedigree";
        food.price = 4.0;
        food.quantity = 20.0;

        Medic medic = new Medic();
        medic.name = "Dr Strange";
        medic.occupation = "Vet";

        Activities activities = new Activities();
        activities.ActivityName = "Ball game";

        Game game = new Game();
        game.adaptor = adaptor;
        //game.


//        System.out.println("It's name is: " + animal1.name);
//        System.out.println("It's age is: " + animal1.age);
//        System.out.println("It's preferred game is: " + animal1.preferredGame);
//        System.out.println("It's preferred food is: " + animal1.preferredFood);
//

    }
}
