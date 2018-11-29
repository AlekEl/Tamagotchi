package tamagotchiGame;

import javafx.application.Application;
import javafx.stage.Stage;
import tamagotchiGame.controller.GameController;
import tamagotchiGame.model.Food;
import tamagotchiGame.model.Play;
import tamagotchiGame.model.Sleep;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Food food = new Food();
        Sleep sleep = new Sleep();
        Play play = new Play();
        GameController gameController = new GameController(primaryStage, food, sleep, play);
        gameController.initializeGame();
        gameController.start();
        primaryStage.setOnCloseRequest(e -> System.exit(0));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
