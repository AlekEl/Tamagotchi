package tamagotchiGame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import tamagotchiGame.model.StatusBar;

public class BoardController {
    private double foodProgress = 0.0;

    @FXML private ProgressBar sleepBarFxml;
    @FXML private ProgressBar playBarFxml;
    @FXML private ProgressBar foodBarFxml;
    private StatusBar sleepBar = new StatusBar(0.1, 0.2);
    private StatusBar playBar = new StatusBar(0.1, 0.2);
    private StatusBar foodBar = new StatusBar(0.1, 0.2);

    @FXML protected void handleFoodButtonPressed(ActionEvent event) {
        System.out.println("Food Pressed!");
        foodBarFxml.setProgress(foodBar.increseStatus());
    }

    @FXML protected void handleSleepButtonPressed(ActionEvent event) {
        System.out.println("Sleep Pressed!");
    }

    @FXML protected void handlePlayButtonPressed(ActionEvent event) {
        System.out.println("Play Pressed!");
    }

}
