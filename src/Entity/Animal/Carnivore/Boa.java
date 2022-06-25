package Entity.Animal.Carnivore;

import Entity.Animal.Herbivore.*;

import java.util.HashMap;

public class Boa extends Carnivore {
    private static final double WEIGHT = 15.0d;
    private static final int MAX_COUNT = 30;
    private static final int SPEED = 1;
    private static final double HUNGER = 3.0d;

    public Boa(int x, int y) {
        super(x, y, WEIGHT, MAX_COUNT, SPEED, HUNGER, new HashMap<>(){{
            put(Fox.class, 15);

            put(Duck.class, 10);
            put(Mouse.class, 40);
            put(Rabbit.class, 20);
        }});
    }
}
