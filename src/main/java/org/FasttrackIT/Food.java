package org.FasttrackIT;


import java.text.SimpleDateFormat;

public class Food extends Activities {
    //String name;
    private Double price;
    private Double quantity;
    //java.time.LocalDateTime expirationDate;
    //Error:(8, 14) java: package java.time does not exist
    private int inStoc;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public int getInStoc() {
        return inStoc;
    }

    public void setInStoc(int inStoc) {
        this.inStoc = inStoc;
    }

    public Food(String name, Double price, Double quantity, int inStoc) {
        super(name);
        this.price = price;
        this.quantity = quantity;
        this.inStoc = inStoc;
    }
}
