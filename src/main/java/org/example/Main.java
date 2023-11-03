package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("wuffi", 7);
        Animal cat = new Animal("mutzi", 5);
        Animal cat2 = new Animal("mutzi", 5);
        Animal bird = new Animal("tweety", 2);

        Set<Animal> animalsFed = new HashSet<>();

        animalsFed.add(dog);
        animalsFed.add(cat);
        animalsFed.add(bird);
        animalsFed.add(bird);
        animalsFed.add(cat);
        animalsFed.add(cat);
        animalsFed.add(cat2);

        Map<Animal, String> favoriteFoods = new HashMap<>();
        favoriteFoods.put(dog, "dogfood");
        favoriteFoods.put(cat, "fish");
        favoriteFoods.put(bird, "seeds");

        String catsFavoriteFood = favoriteFoods.get(cat);
        System.out.println("Lieblingsfutter der Katze: " + catsFavoriteFood);

        for (Animal animal : animalsFed) {
            String favoriteFood = favoriteFoods.get(animal);
            System.out.println("Ich habe heute gefüttert: " + animal.getName() + " (Lieblingsfutter: " + favoriteFood + ")");
        }
    }
}