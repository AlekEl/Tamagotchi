package tamagotchiGame.controller;

import javafx.fxml.FXML;

public class BoardController{

    @FXML void handleFoodButtonPressed() {
        System.out.println("Food Pressed!");
    }

    @FXML void handleSleepButtonPressed() {
        System.out.println("Sleep Pressed!");
    }

    @FXML void handlePlayButtonPressed() {
        System.out.println("Play Pressed!");
    }

}
