package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Entity.Entity;

import java.util.HashMap;

public abstract class Herbivore extends Animal {
    public Herbivore(int x, int y, double weight, int maxCount, int speed, double hunger, HashMap<Class<? extends Entity>, Integer> chanceToEat) {
        super(x, y, weight, maxCount, speed, hunger, chanceToEat);
    }
}
