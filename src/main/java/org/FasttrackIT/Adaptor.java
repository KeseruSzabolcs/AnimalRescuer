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
}
