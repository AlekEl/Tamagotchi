package tamagotchiGame;

import javafx.application.Application;
import javafx.stage.Stage;
import tamagotchiGame.controller.GameController;
import tamagotchiGame.model.Tamagotchi;

import java.util.Timer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Tamagotchi tamagotchi = new Tamagotchi();
        GameController gameController = new GameController(primaryStage, tamagotchi);
        gameController.initializeGame();
        Timer timer = new Timer();
        timer.schedule(gameController, 0, 2000);
        primaryStage.setOnCloseRequest(e -> System.exit(0));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
