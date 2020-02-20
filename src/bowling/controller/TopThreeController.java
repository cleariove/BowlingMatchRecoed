package bowling.controller;

import bowling.logic.AllPlayers;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.net.URL;
import java.util.ResourceBundle;

public class TopThreeController implements Initializable {

    @FXML
    private Label one;

    @FXML
    private Label two;

    @FXML
    private Label three;


    @FXML
    private ImageView imageView_1;

    @FXML
    private ImageView imageView_2;

    @FXML
    private ImageView imageView_3;


    public void setTopThree(){
        imageView_1.getX();
        FadeTransition ft1 = new FadeTransition(Duration.millis(5000),imageView_1);
        FadeTransition ft2 = new FadeTransition(Duration.millis(5000),imageView_2);
        FadeTransition ft3 = new FadeTransition(Duration.millis(5000),imageView_3);
        ft1.setToValue(0);
        ft1.setFromValue(1.0);
        ft1.setCycleCount(Timeline.INDEFINITE);
        ft1.setAutoReverse(true);
        ft2.setToValue(0);
        ft2.setFromValue(1.0);
        ft2.setCycleCount(Timeline.INDEFINITE);
        ft2.setAutoReverse(true);
        ft3.setToValue(0);
        ft3.setFromValue(1.0);
        ft3.setCycleCount(Timeline.INDEFINITE);
        ft3.setAutoReverse(true);
        ft1.play();
        //ft2.play();
        ft3.play();
        AllPlayers topThreePlayers = new AllPlayers();
        SingleMatchController singleMatchController=new SingleMatchController();
        singleMatchController.getTopThreeTeam(topThreePlayers);
        one.setText(topThreePlayers.get(0).getName());
        two.setText(topThreePlayers.get(1).getName());
        three.setText(topThreePlayers.get(2).getName());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTopThree();
    }
}
