package org.FasttrackIT;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Activities activities = new Activities("ball game");
        //activities.name = "Ball game";

        Animal animal1 = new Animal("LenoXz", 10, 10, 10, 10, "Dog Food", "Ball Game");
        //animal1.setName("Leno");
//        animal1.age = 14;
//        animal1.hunger = 10;
//        animal1.health = 10;
//        animal1.happyness = 10;
//        animal1.preferredFood = "Dog Food";
//        animal1.preferredGame = "Ball game";

        Adaptor adaptor = new Adaptor("JohnX", 29.4);
        //adaptor.name = "John";
        //adaptor.moneyAvaliable = 29.4;

        Food food = new Food("PedigreeX", 6.0, 10.0, 20);
//        food.inStoc = 6;
//        food.name = "Pedigree";
//        food.price = 4.0;
//        food.quantity = 20.0;

        Medic medic = new Medic("Dr Strange", "Vet");
        //medic.name = "Dr Strange";
        //medic.occupation = "Vet";

        Game game = new Game();
        game.adaptor = adaptor;
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
        System.out.println("Quantity in the marker: " + food.getQuantity());
        System.out.println("--------------");
        System.out.print("Information about the medic: ");
        medic.print();
        System.out.println("His occupation is: " + medic.getOccupation());
        System.out.println("--------------");
        System.out.print("Favorite activities: ");
        activities.print();
    }
}
