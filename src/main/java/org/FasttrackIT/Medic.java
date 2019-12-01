package org.FasttrackIT;

public class Medic {
    //String name;
    private String name;
    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Medic(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public void print() {
        System.out.println(getName());
    }
}
