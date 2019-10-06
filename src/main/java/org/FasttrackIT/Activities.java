package org.FasttrackIT;

public class Activities {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activities(String name) {
        this.name = name;
    }

    public void print() {
    System.out.println(name);
}



}
