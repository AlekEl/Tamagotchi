package tamagotchiGame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TamagotchiTest {

    Tamagotchi tamagotchi;

    @BeforeEach
    void setUp() {
        this.tamagotchi = new Tamagotchi();
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
        Assertions.assertEquals((Double) 0.95, tamagotchi.getFood().getValue());
    }

    @Test
    void decreaseSleep() {
        tamagotchi.sleep();
        tamagotchi.decreaseSleep();
        Assertions.assertEquals((Double) 0.95, tamagotchi.getSleep().getValue());
    }

    @Test
    void decreaseFun() {
        tamagotchi.haveFun();
        tamagotchi.decreaseFun();
        Assertions.assertEquals((Double) 0.95, tamagotchi.getFun().getValue());
    }

    @Test
    void haveFun() {
        tamagotchi.haveFun();
        tamagotchi.decreaseFun();
        Assertions.assertEquals((Double) 0.95, tamagotchi.getFun().getValue());
    }

}