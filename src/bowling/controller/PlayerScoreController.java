package bowling.controller;

import bowling.dao.PlayerDAOImpl;
import bowling.logic.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PlayerScoreController implements Initializable {

    @FXML
    private TextField score;

    @FXML
    private TextField sex;

    @FXML
    private TextField name;

    @FXML
    private TextField ID;

    public void setTextField(){

       MainViewController mainViewController=new MainViewController();
       String a= mainViewController.findScore();
       PlayerDAOImpl playerDAO=new PlayerDAOImpl();
        Player  player= playerDAO.getOnePlayerByName(a);
        name.setText(player.getName());
        sex.setText(player.getSex());
        ID.setText(player.getId());
        score.setText(String.valueOf(player.getScore()) );

    }
    public void setFind(){


        try {
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("../views/PlayerScore.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("成绩查询");
            anotherStage.setScene(new Scene(anotherRoot, 600, 400));

            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setFind();
    }
}
