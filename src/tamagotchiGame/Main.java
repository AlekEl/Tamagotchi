package tamagotchiGame;

import javafx.application.Application;
import javafx.stage.Stage;
import tamagotchiGame.controller.GameController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GameController gameController = new GameController(primaryStage);
        gameController.initializeGame();
        gameController.start();
        primaryStage.setOnCloseRequest(e -> System.exit(0));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
