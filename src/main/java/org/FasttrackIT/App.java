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
        food.inStoc = 6;
        food.name = "Pedigree";
        food.price = 4.0;
        food.quantity = 20.0;

        Medic medic = new Medic();
        medic.name = "Dr Strange";
        medic.occupation = "Vet";

        Activities activities = new Activities();
        activities.name = "Ball game";

        Game game = new Game();
        game.adaptor = adaptor;
        //game.

        System.out.println("Information about animal: ");
        System.out.print("It's name is: ");
        animal1.print();
        System.out.println("It's age is: " + animal1.age);
        System.out.println("It's preferred game is: " + animal1.preferredGame);
        System.out.println("It's preferred food is: " + animal1.preferredFood);
        System.out.println("--------------");
        System.out.println("Information about adaptor");
        System.out.print("Hi's name is: ");
        adaptor.print();
        System.out.println("Hi's money: " + adaptor.moneyAvaliable);
        System.out.println("--------------");
        System.out.println("Information about dog food: ");
        System.out.print("It's name is: ");
        food.print();
        System.out.println("Has in stock " + food.inStoc);
        System.out.println("It's price is " + food.price);
        System.out.println("Quantity in the marker: " + food.quantity);
        System.out.println("--------------");
        System.out.print("Information about the medic: ");
        medic.print();
        System.out.println("His occupation is: " + medic.occupation);
        System.out.println("--------------");
        System.out.print("Favorite activities: ");
        activities.print();
    }
}
