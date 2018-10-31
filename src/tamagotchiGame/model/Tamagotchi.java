package tamagotchiGame.model;

import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Tamagotchi {

    private DoubleProperty Food = new SimpleDoubleProperty();
    private DoubleProperty Fun = new SimpleDoubleProperty();
    private DoubleProperty Sleep = new SimpleDoubleProperty();

    public Tamagotchi() {
        Food.setValue(1.0);
        Fun.setValue(1.0);
        Sleep.setValue(1.0);
    }

    public synchronized void feed() {
        this.Food.setValue(1.0);
    }

    public synchronized void sleep() {
        this.Sleep.setValue(1.0);
    }

    public synchronized void decreaseFood() {
        this.Food.setValue(this.Food.getValue() - 0.01);
        if (this.Food.getValue() <= 0.0) {
            Platform.exit();
        }
    }

    public synchronized void decreaseSleep() {
        this.Sleep.setValue(this.Sleep.getValue() - 0.01);
        if (this.Sleep.getValue() <= 0.0) {
            Platform.exit();
        }
    }

    public synchronized void decreaseFun() {
        this.Fun.setValue(this.Fun.getValue() - 0.01);
        if (this.Food.getValue() <= 0.0) {
            Platform.exit();
        }
    }

    public synchronized void haveFun() {
        if (this.Fun.getValue() < 0.8) {
            this.Fun.setValue(this.Fun.getValue() + 0.2);
        } else {
            this.Fun.setValue(1.0);
        }
    }

    public synchronized DoubleProperty getFood() {
        return this.Food;
    }

    public synchronized DoubleProperty getFun() {
        return this.Fun;
    }

    public synchronized DoubleProperty getSleep() {
        return this.Sleep;
    }

}
