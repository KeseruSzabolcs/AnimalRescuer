package org.FasttrackIT;


import java.time.LocalDate;

public class Food {
    private String name;
    private Double price;
    private Double quantity;
    private int inStoc;
    private LocalDate expirationDate;
    public Food(String name, Double price, Double quantity, LocalDate expirationDate, int inStoc) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.inStoc = inStoc;
    }
    public Food(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void print() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", inStoc=" + inStoc +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
