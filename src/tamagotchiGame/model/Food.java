package tamagotchiGame.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Food {

    private double fallValue = 0.08;
    private DoubleProperty FoodValue = new SimpleDoubleProperty();

    public Food() {
        FoodValue.setValue(1.0);
    }

    public synchronized void feed() {
        this.FoodValue.setValue(1.0);
    }

    public synchronized void decreaseFood() {
        this.FoodValue.setValue(this.FoodValue.getValue() - fallValue);
        if (this.FoodValue.getValue() <= 0.0) {
            System.exit(0);
        }
    }

    public synchronized DoubleProperty getFood() {
        return this.FoodValue;
    }

    double getFallValue() {
        return fallValue;
    }

}
