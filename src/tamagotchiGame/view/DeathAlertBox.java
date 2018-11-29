package tamagotchiGame.view;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import tamagotchiGame.controller.GameController;

import java.util.Optional;

public class DeathAlertBox {

    public void showAlert(GameController gameController) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText("Loli has died... You're a bad daddy!");
        alert.setContentText("Click OK to restart, Cancel to exit the game.");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            gameController.initializeGame();
            gameController.start();
        } else {
            System.exit(0);
        }
    }
}
