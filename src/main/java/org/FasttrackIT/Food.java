package org.FasttrackIT;


import java.text.SimpleDateFormat;

public class Food extends Activities{
    //String name;
    Double price;
    Double quantity;
    //java.time.LocalDateTime expirationDate;
    //Error:(8, 14) java: package java.time does not exist
    int inStoc;

    public Food(String name, Double price, Double quantity, int inStoc) {
        super(name);
        this.price = price;
        this.quantity = quantity;
        this.inStoc = inStoc;
    }
}
