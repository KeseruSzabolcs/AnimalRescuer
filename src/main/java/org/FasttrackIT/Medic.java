package org.FasttrackIT;

public class Medic extends Activities{
     //String name;
     private String  occupation;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Medic(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }
}
