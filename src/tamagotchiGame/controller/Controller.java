package tamagotchiGame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    @FXML protected void handleFoodButtonPressed(ActionEvent event) {
        System.out.println("Food Pressed!");
    }

    @FXML protected void handleSleepButtonPressed(ActionEvent event) {
        System.out.println("Sleep Pressed!");
    }

    @FXML protected void handlePlayButtonPressed(ActionEvent event) {
        System.out.println("Play Pressed!");
    }

}
