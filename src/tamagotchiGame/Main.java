package tamagotchiGame;

import javafx.application.Application;
import javafx.stage.Stage;
import tamagotchiGame.controller.GameController;
import tamagotchiGame.model.Food;
import tamagotchiGame.model.Play;
import tamagotchiGame.model.Sleep;

import java.util.Timer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Food food = new Food();
        Sleep sleep = new Sleep();
        Play play = new Play();
        GameController gameController = new GameController(primaryStage, food, sleep, play);
        gameController.initializeGame();
        Timer timer = new Timer();
        timer.schedule(gameController, 0, 2000);
        primaryStage.setOnCloseRequest(e -> System.exit(0));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
