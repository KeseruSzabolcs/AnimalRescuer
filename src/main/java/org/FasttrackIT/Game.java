package org.FasttrackIT;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private List<Food> avalibleFood = new ArrayList<>();
    private Activities[] avaliableActivities = new Activities[2];

    public void start(){
        initFood();
        initFood();
    }

    private void initFood(){
        int foodCount = 2;

        System.out.println("Today's foods are: ");

        for(int i=0; i<foodCount; i++){
            Food food = new Food("X",1.0,1.0,LocalDate.now(),1);
            food.setName("food" + i);
            food.setExpirationDate(randomDate());
            food.setInStoc((int) Math.round(Math.random()*10));
            food.setPrice(Math.random()*10);
            food.setQuantity(Math.random()*10);
            System.out.println(food.toString());
        }
    }

    private LocalDate randomDate(){

        Long x = Math.round(Math.random()*10000);
        Long randomYear = LocalDate.now().getYear() + x;
        LocalDate randomDate = LocalDate.ofEpochDay(randomYear);
        System.out.println(randomYear);
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
