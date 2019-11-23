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
          animal.setHappyness(animal.getHappyness()-1);
          System.out.println("Animal happyness level " + animal.getHappyness());

     }

     @Override
     public void acctivity(Activities activities, Animal animal){
          System.out.println(getName() + " is playing " + activities.getName() + " with " + animal.getName());
          animal.setHappyness(animal.getHappyness()+1);
          System.out.println("Animal happyness level " + animal.getHappyness());
     }
}
