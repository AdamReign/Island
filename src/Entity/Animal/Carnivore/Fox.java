package Entity.Animal.Carnivore;

import Entity.Animal.Herbivore.*;

import java.util.HashMap;

public class Fox extends Carnivore {
    private static final double WEIGHT = 8.0d;
    private static final int MAX_COUNT = 30;
    private static final int SPEED = 2;
    private static final double HUNGER = 2.0d;

    public Fox(int x, int y) {
        super(x, y, WEIGHT, MAX_COUNT, SPEED, HUNGER, new HashMap<>(){{
            put(Caterpillar.class, 40);
            put(Duck.class, 60);
            put(Mouse.class, 90);
            put(Rabbit.class, 70);
        }});
    }
}
