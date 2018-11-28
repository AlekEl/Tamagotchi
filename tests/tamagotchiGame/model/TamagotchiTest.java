package tamagotchiGame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TamagotchiTest {

    private Sleep sleep;
    private Play play;
    private Food food;
    private double sleepDecreaseValue = 0.0;
    private double playDecreaseValue = 0.0;
    private double foodDecreaseValue = 0.0;

    @BeforeEach
    void setUp() {
        this.sleep = new Sleep();
        this.play = new Play();
        this.food = new Food();
        double sleepFalldValue = sleep.getFallValue();
        double playFallValue = play.getFallValue();
        double foodFallValue = food.getFallValue();
        this.sleepDecreaseValue = 1.0 - sleepFalldValue;
        this.playDecreaseValue = 1.0 - playFallValue;
        this.foodDecreaseValue = 1.0 - foodFallValue;
    }

    @Test
    void feed() {
        food.feed();
        Assertions.assertEquals((Double) 1.0, food.getFood().getValue());
    }

    @Test
    void sleep() {
        sleep.sleep();
        Assertions.assertEquals((Double) 1.0, sleep.getSleep().getValue());
    }

    @Test
    void decreaseFood() {
        food.feed();
        food.decreaseFood();
        Assertions.assertEquals((Double) foodDecreaseValue, food.getFood().getValue());
    }

    @Test
    void decreaseSleep() {
        sleep.sleep();
        sleep.decreaseSleep();
        Assertions.assertEquals((Double) sleepDecreaseValue, sleep.getSleep().getValue());
    }

    @Test
    void decreaseFun() {
        play.haveFun();
        play.decreasePlay();
        Assertions.assertEquals((Double) playDecreaseValue, play.getPlay().getValue());
    }

    @Test
    void haveFun() {
        play.haveFun();
        play.decreasePlay();
        Assertions.assertEquals((Double) playDecreaseValue, play.getPlay().getValue());
    }

}