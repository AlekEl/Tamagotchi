package tamagotchiGame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TamagotchiTest {

    private Tamagotchi tamagotchi;
    private double fallValue = 0.0;
    private double decreasedValue = 0.0;

    @BeforeEach
    void setUp() {
        this.tamagotchi = new Tamagotchi();
        this.fallValue = tamagotchi.getFallValue();
        this.decreasedValue = 1.0 - fallValue;
    }

    @Test
    void feed() {
        tamagotchi.feed();
        Assertions.assertEquals((Double) 1.0, tamagotchi.getFood().getValue());
    }

    @Test
    void sleep() {
        tamagotchi.sleep();
        Assertions.assertEquals((Double) 1.0, tamagotchi.getSleep().getValue());
    }

    @Test
    void decreaseFood() {
        tamagotchi.feed();
        tamagotchi.decreaseFood();
        Assertions.assertEquals((Double) decreasedValue, tamagotchi.getFood().getValue());
    }

    @Test
    void decreaseSleep() {
        tamagotchi.sleep();
        tamagotchi.decreaseSleep();
        Assertions.assertEquals((Double) decreasedValue, tamagotchi.getSleep().getValue());
    }

    @Test
    void decreaseFun() {
        tamagotchi.haveFun();
        tamagotchi.decreaseFun();
        Assertions.assertEquals((Double) decreasedValue, tamagotchi.getFun().getValue());
    }

    @Test
    void haveFun() {
        tamagotchi.haveFun();
        tamagotchi.decreaseFun();
        Assertions.assertEquals((Double) decreasedValue, tamagotchi.getFun().getValue());
    }

}