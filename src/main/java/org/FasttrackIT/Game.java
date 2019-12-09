package org.FasttrackIT;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private List<Food> avalibleFood = new ArrayList<>();
    int foodCount = 2;
    private Activities[] avaliableActivities = new Activities[3];

    public void start() {
//        initFood();
//        System.out.println("Today's foods names are:");
//        listFoods();
//        System.out.println("");
//        initActivities();
//        System.out.println("Today's activities names are");
//        listActivities();
//        System.out.println("");
        initAnimal2();
        initRescuer();
        nameAnimal();
    }


    //LIST
    private void initFood() {

        System.out.println("Today's foods are: ");

        for (int i = 0; i < foodCount; i++) {
            Food food = new Food("X", 1.0, 1.0, LocalDate.now(), 1);
            food.setName("food" + i);
            food.setExpirationDate(randomDate());
            food.setInStoc((int) Math.round(Math.random() * 10));
            food.setPrice(Math.random() * 10);
            food.setQuantity(Math.random() * 10);
            System.out.println(food.toString());
            avalibleFood.add(food);
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

    private void initAnimal() {
        Animal animal = new Animal("X", 10, 10, 10, 10, "food", "Ball game");
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can only choose a Dog or a Cat, or else...:)");
        String x = scanner.nextLine();
        if (x.equals("Dog") || x.equals("dog")) {
            animal.setName("Dog");
            animal.setPreferredGame("Ball Game");
        } else if (x.equals("Cat") || x.equals("cat")) {
            animal.setName("Cat");
            animal.setPreferredGame("It doesn't like to play");
        } else {
            System.out.println("I did warn you...");
            System.exit(1);
        }
        animal.setPreferredFood(animal.getName() + " Food");
        animal.setAge((int) Math.random() * 10 + 1);
        System.out.println(animal.toString());
    }

    private void initAnimal2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can only choose a Wild Animal or a Fictional Animal, or else...:)");
        String x = scanner.nextLine();
        if (x.equals("Wild") || x.equals("wild") || x.equals("Wild Animal") || x.equals("wild animal")) {
            Animal animal = new WildAnimal("Lord", 2, 10, 10, 10, "Wolf Food", "Stick game", true);
            System.out.println(animal.toString());
        } else if (x.equals("Fictional") || x.equals("fictional") || x.equals("Fictional Animal") || x.equals("fictional animal")) {
            Animal animal = new FictionalAnimal("Nemo", 2, 10, 10, 10, "Imaginary Food", "Imaginary game", false);
            System.out.println(animal.toString());
        } else {
            System.out.println("I did warn you...");
            System.exit(1);
        }
    }

    private void initRescuer() {
        Adaptor rescuer = new Adaptor("John", (Math.random() * 10 + 1));
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        //searches for number
        if ((x.matches(".*\\d.*"))) {
            System.out.println("What are you, a robot?!\nLet's try again");
            initRescuer();
        } else if (x.isEmpty()){
            System.out.println("You entered a blank value\nLet's try again");
            initRescuer();
        } else {
            rescuer.setName(x);
            System.out.println(rescuer.getName() + " has: " + rescuer.getMoneyAvaliable() + " money available");
        }
    }


    private void nameAnimal(){
        System.out.println("What is the animals name");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
    }

    private void listFoods() {
        try {
            for (int i = 0; i < foodCount; i++) {
                System.out.println(avalibleFood.get(i).getName());
            }

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            throw new RuntimeException("Sorry, let's try again");
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

    private LocalDate randomDate() {

        Long x = (ThreadLocalRandom.current().nextLong(16243, 17338));
        Long randomYear = LocalDate.now().getYear() + x;
        LocalDate randomDate = LocalDate.ofEpochDay(randomYear);
        return randomDate;
    }

    public List<Food> getAvalibleFood() {
        return avalibleFood;
    }

    public void setAvalibleFood(List<Food> avalibleFood) {
        this.avalibleFood = avalibleFood;
    }

    public Activities[] getAvaliableActivities() {
        return avaliableActivities;
    }

    public void setAvaliableActivities(Activities[] avaliableActivities) {
        this.avaliableActivities = avaliableActivities;
    }
}

//todo În clasa Game, creați o nouă metodă private void nameAnimal prin care să îi solicitați utilizatorului să îi dea un nume animalului salvat. Citiți datele introduse de utilizator folosind clasa Scanner și stocați numele introdus în proprietatea name a obiectului animal din clasa Game.