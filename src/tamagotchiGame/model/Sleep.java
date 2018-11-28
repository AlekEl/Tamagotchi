package tamagotchiGame.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Sleep implements Runnable  {

    private double fallValue = 0.05;
    private DoubleProperty SleepValue = new SimpleDoubleProperty();

    public Sleep() {
        SleepValue.setValue(1.0);
    }

    public synchronized void sleep() {
        this.SleepValue.setValue(1.0);
    }

    public synchronized void decreaseSleep() {
        this.SleepValue.setValue(this.SleepValue.getValue() - fallValue);
        if (this.SleepValue.getValue() <= 0.0) {
            System.exit(0);
        }
    }

    public synchronized DoubleProperty getSleep() {
        return this.SleepValue;
    }

    double getFallValue() {
        return fallValue;
    }

    @Override
    public void run() {
        decreaseSleep();
    }
}
