package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String dog = "wuffi";
        String cat = "mutzi";
        String bird = "tweety";

        Set<String> animalsFed = new HashSet<>();

        animalsFed.add(dog);
        animalsFed.add(cat);
        animalsFed.add(bird);
        animalsFed.add(bird);
        animalsFed.add(cat);
        animalsFed.add(cat);
        animalsFed.add(cat);

        for (String animal : animalsFed) {
            System.out.println("Ich habe heute gefüttert: "+animal);
        }
    }
}