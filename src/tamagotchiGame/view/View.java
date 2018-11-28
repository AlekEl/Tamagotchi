package tamagotchiGame.view;

import javafx.scene.Parent;
import javafx.scene.control.ProgressBar;
import tamagotchiGame.model.Food;
import tamagotchiGame.model.Play;
import tamagotchiGame.model.Sleep;

public class View {

    public void setUpBindings(Food food, Sleep sleep, Play play, Parent root) {
        String feedingBarSelector = "#foodBar";
        String funBarSelector = "#funBar";
        String sleepBarSelector = "#sleepBar";

        ProgressBar feedingBar = (ProgressBar) root.lookup(feedingBarSelector);
        ProgressBar funBar = (ProgressBar) root.lookup(funBarSelector);
        ProgressBar sleepBar = (ProgressBar) root.lookup(sleepBarSelector);

        feedingBar.progressProperty().bindBidirectional(food.getFood());
        funBar.progressProperty().bindBidirectional(play.getPlay());
        sleepBar.progressProperty().bindBidirectional(sleep.getSleep());
    }

}
