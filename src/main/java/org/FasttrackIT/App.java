package org.FasttrackIT;


import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Activities activities = new Activities("Ball Game");
        Activities activities2 = new Activities("Stick game");
        Activities activities3 = new Activities(" game");
        //activities.name = "Ball game";

        Animal animal1 = new Animal("Leno", 10, 10, 10, 10, "Dog Food", "Ball Game");
        //animal1.setName("Leno");
//        animal1.age = 14;
//        animal1.hunger = 10;
//        animal1.health = 10;
//        animal1.happiness = 10;
//        animal1.preferredFood = "Dog Food";
//        animal1.preferredGame = "Ball game";
        Animal animalWolf = new WildAnimal("Lord", 2, 10, 10, 10, "Wolf Food", "Stick game", true);
        Animal fictional = new FictionalAnimal("Nemo", 2, 10, 10, 10, "Imaginary Food", "Imaginary game", false);

        Adaptor adaptor = new Adaptor("John", 29.4);
        //adaptor.name = "John";
        //adaptor.moneyAvaliable = 29.4;

        Food food = new Food("Dog Food", 6.0, 10.0, LocalDate.of(2019, 07, 12), 10);
        Food food2 = new Food("Wolf Food", 6.0, 10.0, LocalDate.of(2019, 07, 12), 10);
        Food food3 = new Food("Imaginary Food", 6.0, 10.0, LocalDate.of(2019, 07, 12), 10);
//        food.inStoc = 6;
//        food.name = "Pedigree";
//        food.price = 4.0;
//        food.quantity = 20.0;
        Medic medic = new Medic("Dr Strange", "Vet");
        //medic.name = "Dr Strange";
        //medic.occupation = "Vet";

        Game game = new Game();
        //game.
        System.out.println("Information about animal: ");
        System.out.print("It's name is: ");
        animal1.print();
        System.out.println("It's age is: " + animal1.getAge());
        System.out.println("It's preferred game is: " + animal1.getPreferredGame());
        System.out.println("It's preferred food is: " + animal1.getPreferredFood());
        System.out.println("--------------");
        System.out.println("Information about adaptor");
        System.out.print("Hi's name is: ");
        adaptor.print();
        System.out.println("Hi's money: " + adaptor.getMoneyAvaliable());
        System.out.println("--------------");
        System.out.println("Information about dog food: ");
        System.out.print("It's name is: ");
        food.print();
        System.out.println("Has in stock " + food.getInStoc());
        System.out.println("It's price is " + food.getPrice());
        System.out.println("It will expire in " + food.getExpirationDate());
        System.out.println("Quantity in the marker: " + food.getQuantity());
        System.out.println("--------------");
        System.out.print("Information about the medic: ");
        medic.print();
        System.out.println("His occupation is: " + medic.getOccupation());
        System.out.println("--------------");
        System.out.print("Favorite activities: ");
        activities.print();

        adaptor.feed(food, animal1);
        adaptor.acctivity(activities, animal1);
        System.out.println("----++++++------");
        //medic.feed(food, animal1);
        //medic.acctivity(activities, animal1);
        System.out.println("////////////");
        animalWolf.print();
        adaptor.feed(food2, animalWolf);
        adaptor.acctivity(activities2, animalWolf);
        System.out.println("----++++++------");
        //medic.feed(food2, animalWolf);
        //medic.acctivity(activities2, animalWolf);
        System.out.println("||||||||||||||||||||");
        fictional.print();
        adaptor.feed(food3, fictional);
        adaptor.acctivity(activities3, fictional);
        System.out.println("----++++++------");
        //medic.feed(food3, fictional);
        //medic.acctivity(activities3, fictional);

    }
}
