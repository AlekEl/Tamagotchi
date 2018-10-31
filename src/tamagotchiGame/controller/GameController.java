package tamagotchiGame.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tamagotchiGame.model.Tamagotchi;
import tamagotchiGame.view.View;

import java.io.IOException;
import java.util.TimerTask;

public class GameController extends TimerTask {

    private Tamagotchi tamagotchi;
    private Stage primaryStage;

    public GameController(Stage primaryStage, Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
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
        view.setUpBindings(tamagotchi, root);
        primaryStage.setTitle("Tamagotchi");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
    }

    public void run() {
        tamagotchi.decreaseFood();
        tamagotchi.decreaseFun();
        tamagotchi.decreaseSleep();
    }

    @FXML
    void haveFun() {
        this.tamagotchi.haveFun();
    }

    @FXML
    public void feed() {
        this.tamagotchi.feed();
    }

    @FXML
    public void sleep() {
        this.tamagotchi.sleep();
    }

}

