package Entity;

import Entity.Animal.Animal;
import Entity.Animal.Carnivore.*;
import Entity.Animal.Herbivore.*;
import Entity.Plant.*;

import java.util.HashSet;

public final class EntityCreator {
    private static HashSet<Class<? extends Animal>> allAnimals = new HashSet<>(){{
        add(Bear.class);
        add(Boa.class);
        add(Eagle.class);
        add(Fox.class);
        add(Wolf.class);

        add(Boar.class);
        add(Buffalo.class);
        add(Caterpillar.class);
        add(Deer.class);
        add(Duck.class);
        add(Goat.class);
        add(Horse.class);
        add(Mouse.class);
        add(Rabbit.class);
        add(Sheep.class);
    }};

    private static HashSet<Class<? extends Plant>> allPlants = new HashSet<>(){{
        add(Grass.class);
    }};

    private static HashSet<Class<? extends Entity>> allEntities = new HashSet<>(){{
        addAll(allAnimals);
        addAll(allPlants);
    }};

    private EntityCreator() {
    }

    public static Plant create(Class<? extends Plant> plant) {
        try {
            return plant.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static Animal create(Class<? extends Animal> animal, int x, int y) {
        try {
            return animal.getConstructor(int.class, int.class).newInstance(x, y);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static HashSet<Class<? extends Animal>> getAllAnimals() {
        return allAnimals;
    }

    public static HashSet<Class<? extends Plant>> getAllPlants() {
        return allPlants;
    }

    public static HashSet<Class<? extends Entity>> getAllEntities() {
        return allEntities;
    }
}
