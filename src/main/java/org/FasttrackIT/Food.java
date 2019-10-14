package org.FasttrackIT;


import java.time.LocalDate;

public class Food extends Activities {
    //String name;
    private Double price;
    private Double quantity;
    private LocalDate expirationDate;
    private int inStoc;

    public Food(String name, Double price, Double quantity, LocalDate expirationDate, int inStoc) {
        super(name);
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.inStoc = inStoc;
    }

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

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
