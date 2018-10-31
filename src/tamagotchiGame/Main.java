package tamagotchiGame;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import tamagotchiGame.controller.BoardController;
import tamagotchiGame.controller.GameLoop;
import tamagotchiGame.model.Tamagotchi;
import tamagotchiGame.view.View;

import java.util.Timer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Tamagotchi tamagotchi = new Tamagotchi();
        GameLoop gameLoop = new GameLoop(primaryStage, tamagotchi);
        gameLoop.initializeGame();
        Timer timer = new Timer();
        timer.schedule(gameLoop, 0, 2000);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
