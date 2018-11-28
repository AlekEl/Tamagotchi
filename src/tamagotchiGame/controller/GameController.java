package tamagotchiGame.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tamagotchiGame.model.Food;
import tamagotchiGame.model.Play;
import tamagotchiGame.model.Sleep;
import tamagotchiGame.view.View;

import java.io.IOException;
import java.util.TimerTask;

public class GameController extends TimerTask {

    private Food food;
    private Sleep sleep;
    private Play play;
    private Stage primaryStage;

    public GameController(Stage primaryStage, Food food, Sleep sleep, Play play) {
        this.food = food;
        this.sleep = sleep;
        this.play = play;
        this.primaryStage = primaryStage;
    }

    public void initializeGame() {
        Parent root = null;
        try {
            FXMLLoader GameLoader = new FXMLLoader(getClass().getResource("../view/board.fxml"));
            GameLoader.setController(this);
            root = GameLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("ROOT: " + root);
        View view = new View();
        view.setUpBindings(food, sleep, play, root);
        primaryStage.setTitle("Tamagotchi");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
    }

    public void run() {
        sleep.decreaseSleep();
        food.decreaseFood();
        play.decreasePlay();
    }

    @FXML
    void haveFun() {
        this.play.haveFun();
    }

    @FXML
    public void feed() {
        this.food.feed();
    }

    @FXML
    public void sleep() {
        this.sleep.sleep();
    }

}

