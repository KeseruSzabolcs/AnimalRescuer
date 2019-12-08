package org.FasttrackIT;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private List<Food> avalibleFood = new ArrayList<>();
    int foodCount = 2;
    private Activities[] avaliableActivities = new Activities[3];

    public void start() {
        initFood();
        System.out.println("Today's foods names are:");
        listFoods();
        System.out.println("");
        initActivities();
        System.out.println("Today's activities names are");
        listActivities();
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
