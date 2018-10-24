package tamagotchiGame.model;

public class StatusBar {
    private double status = 1.0;
    private double statusFall;

    public StatusBar(double statusFall) {
        this.statusFall = statusFall;
    }

    public double decreseStatus() {
        status -= statusFall;
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
}
