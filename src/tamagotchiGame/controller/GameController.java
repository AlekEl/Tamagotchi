package tamagotchiGame.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tamagotchiGame.model.Food;
import tamagotchiGame.model.Play;
import tamagotchiGame.model.Sleep;
import tamagotchiGame.view.DeathAlertBox;
import tamagotchiGame.view.View;

import java.io.IOException;
import java.util.TimerTask;

public class GameController extends TimerTask {

    private Food food;
    private Sleep sleep;
    private Play play;
    private Stage primaryStage;
    private DeathAlertBox box = new DeathAlertBox();
    private boolean isGotchiAlive;

    public GameController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void initializeGame() {
        isGotchiAlive = true;
        food = new Food();
        sleep = new Sleep();
        play = new Play();
        Parent root = null;
        try {
            FXMLLoader GameLoader = new FXMLLoader(getClass().getResource("../view/board.fxml"));
            GameLoader.setController(this);
            root = GameLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        View view = new View();
        view.setUpBindings(food, sleep, play, root);
        primaryStage.setTitle("Tamagotchi");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
    }

    public void run() {
        food.decreaseFood();
        sleep.decreaseSleep();
        play.decreasePlay();
        checkIfGotchiIsAlive();
    }

    private void checkIfGotchiIsAlive() {
        if(food.getFood().getValue() <= 0 || play.getPlay().getValue() <= 0 || sleep.getSleep().getValue() <= 0) {
            isGotchiAlive = false;
            box.showAlert(this);
        }
    }

    public void start() {
        new Thread(() -> {
            while(isGotchiAlive) {
                try{
                    Platform.runLater(this);
                    Thread.sleep(2000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
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

