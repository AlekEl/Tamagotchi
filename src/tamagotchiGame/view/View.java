package tamagotchiGame.view;

import javafx.scene.Parent;
import javafx.scene.control.ProgressBar;
import tamagotchiGame.model.Tamagotchi;

public class View {

    private String feedingBarSelector = "#foodBar";
    private String funBarSelector = "#funBar";
    private String sleepBarSelector = "#sleepBar";

    public void setUpBindings(Tamagotchi tamagotchi, Parent root) {
        ProgressBar feedingBar = (ProgressBar) root.lookup(feedingBarSelector);
        ProgressBar funBar = (ProgressBar) root.lookup(funBarSelector);
        ProgressBar sleepBar = (ProgressBar) root.lookup(sleepBarSelector);

        feedingBar.progressProperty().bindBidirectional(tamagotchi.getFood());
        funBar.progressProperty().bindBidirectional(tamagotchi.getFun());
        sleepBar.progressProperty().bindBidirectional(tamagotchi.getSleep());
    }

}
