package org.FasttrackIT;

public class Adaptor extends Activities{
     //String name;
    private Double moneyAvaliable;

     public Double getMoneyAvaliable() {
          return moneyAvaliable;
     }

     public void setMoneyAvaliable(Double moneyAvaliable) {
          this.moneyAvaliable = moneyAvaliable;
     }

     public Adaptor(String name, Double moneyAvaliable) {
          super(name);
          this.moneyAvaliable = moneyAvaliable;
     }

     @Override
     public void feed(Food food, Animal animal){
          System.out.println(getName() + " just gave " + food.getName() + " to " + animal.getName());
          if(animal.getPreferredFood().equals(food.getName())){
              animal.setHappyness(animal.getHappyness()+1);
          }else {
              animal.setHappyness(animal.getHappyness() - 1);
          }
          System.out.println("Animal happyness level " + animal.getHappyness());

     }

     @Override
     public void acctivity(Activities activities, Animal animal){
          System.out.println(getName() + " is playing " + activities.getName() + " with " + animal.getName());
          if(animal.getPreferredGame().equals(activities.getName())){
              animal.setHappyness(animal.getHappyness()+2);
          }else {
              animal.setHappyness(animal.getHappyness() + 1);
          }
          System.out.println("Animal happyness level " + animal.getHappyness());
     }
}
