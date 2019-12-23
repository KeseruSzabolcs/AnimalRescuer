package org.FasttrackIT;


import java.text.BreakIterator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private List<Food> avalibleFood = new ArrayList<>();
    private Activities[] avaliableActivities = new Activities[3];
    private int foodCount;

    Animal animal = new Animal("Leno", 10, 10, 10, 10, "food0", "Ball Game");
    Adaptor rescuer = new Adaptor("John", 29.4);
    Food food = new Food("Dog Food", 6.0, 10.0, LocalDate.of(2019, 07, 12), 10);
    Medic medic = new Medic("Dr Strange", "Vet");


    public void start() {
//        initFood();
//        System.out.println("Today's foods names are:");
//        listFoods();
//        System.out.println("");
//        initActivities();
//        System.out.println("Today's activities names are");
//        listActivities();
//        System.out.println("");
        initAnimal();
        initRescuer();
        nameAnimal();
        initFood();
        listFoods(foodCount);
        requireFeeding(foodCount);
    }


    //LIST
    private void initFood() {
        System.out.println("How many food picks would you like to have?");
        Scanner scanner = new Scanner(System.in);
        try {
            foodCount = scanner.nextInt();
            if (foodCount == 0) {
                System.out.println("You MUST have foods to pick from!");
                initFood();
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
            throw new RuntimeException("I'm so sorry, you must enter a whole number");
            //System.out.println("I'm so sorry, you must enter a whole number");
            // System.exit(1);
        }
        for (int i = 0; i < foodCount; i++) {
            Food food = new Food("X", 1.0, 1.0, LocalDate.now(), 1);
            food.setName("food" + i);
            food.setExpirationDate(randomDate());
            food.setInStoc((int) Math.round(Math.random() * 10));
            food.setPrice(Math.random() * 10);
            food.setQuantity(Math.random() * 10);
            //System.out.println(food.toString());
            avalibleFood.add(food);
        }
    }

    private void listFoods(int foodCount) {
        if (foodCount != 0) {
            System.out.println("Today's foods are: ");
        }
        for (int i = 0; i < foodCount; i++) {
            System.out.println(avalibleFood.get(i).getName());
        }
    }

    private void requireFeeding(int foodCount) {
        String foodName = null;
        try {
            System.out.println("What food would you like to feed your pet?");
            Scanner scanner = new Scanner(System.in);
            foodName = scanner.nextLine();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry, you entered an invalid food, please try again");
            requireFeeding(foodCount);
        }
        for (int i = 0; i < foodCount; i++) {
            if (avalibleFood.get(i).getName().equals(foodName)) {
                food.setName(foodName);
                animal.setName(animal.getName());
                rescuer.setName(rescuer.getName());
                rescuer.feed(food, animal);
            }
        }
    }

    private void initAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can only choose a Wild Animal or a Fictional Animal, or else...:)");
        String x = scanner.nextLine();
        if (x.equals("Wild") || x.equals("wild") || x.equals("Wild Animal") || x.equals("wild animal")) {
            Animal animal = new WildAnimal("Lord", 2, 10, 10, 10, "Wolf Food", "Stick game", true);
            //System.out.println(animal.toString());
        } else if (x.equals("Fictional") || x.equals("fictional") || x.equals("Fictional Animal") || x.equals("fictional animal")) {
            Animal animal = new FictionalAnimal("Nemo", 2, 10, 10, 10, "Imaginary Food", "Imaginary game", false);
            //System.out.println(animal.toString());
        } else {
            System.out.println("I did warn you...");
            System.exit(1);
        }
    }

    private void nameAnimal() {
        System.out.println("What is the animals name?");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        //Animal animal = new Animal("X", 10, 10, 10, 10, "food", "Ball game");
        if ((x.matches(".*\\d.*"))) {
            System.out.println("What name is this?!\nLet's try again");
            nameAnimal();
        } else if (x.isEmpty()) {
            System.out.println("You entered a blank value\nLet's try again");
            nameAnimal();
        } else {
            animal.setName(x);
            System.out.println(animal);
        }
    }

    private void initRescuer() {
        //Adaptor rescuer = new Adaptor("John", (Math.random() * 10 + 1));
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        //searches for number
        if ((x.matches(".*\\d.*"))) {
            System.out.println("What are you, a robot?!\nLet's try again");
            initRescuer();
        } else if (x.isEmpty()) {
            System.out.println("You entered a blank value\nLet's try again");
            initRescuer();
        } else {
            rescuer.setName(x);
            System.out.println(rescuer);
        }
    }


    private void listActivities() {
        try {
            for (Activities activities : avaliableActivities) {
                System.out.println(activities.getName());
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            throw new RuntimeException("Sorry, try again :)");
        }
    }

    //ARRAY
    private void initActivities() {
        for (int i = 0; i < avaliableActivities.length; i++) {
            Activities activities = new Activities("Y");
            activities.setName("activitie " + i);
            System.out.println(activities.toString());
            avaliableActivities[i] = activities;
        }
    }

    private LocalDate randomDate() {

        Long x = (ThreadLocalRandom.current().nextLong(16243, 17338));
        Long randomYear = LocalDate.now().getYear() + x;
        LocalDate randomDate = LocalDate.ofEpochDay(randomYear);
        return randomDate;
    }
}

