package tamagotchiGame.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Play {

    private double fallValue = 0.08;
    private DoubleProperty PlayValue = new SimpleDoubleProperty();

    public Play() {
        PlayValue.setValue(1.0);
    }

    public synchronized void haveFun() {
        this.PlayValue.setValue(1.0);
    }

    public synchronized void decreasePlay() {
        this.PlayValue.setValue(this.PlayValue.getValue() - fallValue);
        if (this.PlayValue.getValue() <= 0.0) {
            System.exit(0);
        }
    }

    public synchronized DoubleProperty getPlay() {
        return this.PlayValue;
    }

    double getFallValue() {
        return fallValue;
    }

}