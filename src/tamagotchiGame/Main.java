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
        Parent root = FXMLLoader.load(getClass().getResource("view/board.fxml"));
        primaryStage.setTitle("Tamagotchi");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
        Tamagotchi tamagotchi = new Tamagotchi();
        View view = new View();
        view.setUpBindings(tamagotchi, root);

        Timer timer = new Timer();
        timer.schedule(new GameLoop(tamagotchi), 0, 2000);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
