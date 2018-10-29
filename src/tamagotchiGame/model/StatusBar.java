package tamagotchiGame.model;

import javafx.scene.control.ProgressBar;

public class StatusBar {
    private double status = 0.0;
    private double statusFall;
    private double statusRise;

    public StatusBar(double statusFall, double statusRise) {
        this.statusFall = statusFall;
        this.statusRise = statusRise;
    }

    public double decreseStatus() {
        status -= statusFall;
        return status;
    }

    public double increseStatus() {
        status += statusRise;
        if(status > 1.0) status = 1.0;
        return status;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    public double getStatusFall() {
        return statusFall;
    }

    public void setStatusFall(double statusFall) {
        this.statusFall = statusFall;
    }

    public double getStatusRise() {
        return statusRise;
    }

    public void setStatusRise(double statusRise) {
        this.statusRise = statusRise;
    }
}
