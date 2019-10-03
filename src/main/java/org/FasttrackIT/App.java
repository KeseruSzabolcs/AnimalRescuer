package org.FasttrackIT;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        Animal animal1 = new Animal();
        System.out.println("What is it's name?");
        animal1.name = in.nextLine();
        System.out.println("What is it's age?");
        animal1.age = in.nextInt();
        System.out.println("What is it's preferred food?");
        animal1.preferredFood =  in.nextLine();
        System.out.println("What is it's preferred game?");
        animal1.preferredGame = in.nextLine();
        animal1.happyness = 10;
        animal1.health = 10;
        animal1.hunger = 10;
//        System.out.println(animal1.name);
    }
}
