package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

        Map<String, String> favoriteFoods = new HashMap<>();
        favoriteFoods.put(dog, "dogfood");
        favoriteFoods.put(cat, "fish");
        favoriteFoods.put(bird, "seeds");

        String catsFavoriteFood = favoriteFoods.get(cat);
        System.out.println("Lieblingsfutter der Katze: " + catsFavoriteFood);

        for (String animal : animalsFed) {
            String favoriteFood = favoriteFoods.get(animal);
            System.out.println("Ich habe heute gefüttert: " + animal + " (Lieblingsfutter: " + favoriteFood + ")");
        }
    }
}