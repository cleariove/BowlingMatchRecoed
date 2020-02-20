package bowling.controller;


import bowling.dao.PlayerDAOImpl;
import bowling.logic.AllPlayers;
import bowling.logic.Player;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.lang.reflect.Field;
import java.util.Optional;

public class MainViewController {

    private void goToMatch(String title,String fileName)
    {
        try {
            Parent anotherRoot = FXMLLoader.load(getClass().getResource(fileName));
            Stage anotherStage = new Stage();
            anotherStage.setTitle(title);
            anotherStage.setScene(new Scene(anotherRoot, 1210, 830));
            anotherRoot.getStylesheets().add("bowling/views/tableviewCSS.css");
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    public void goToSingleMatch(){
        goToMatch("单人赛","../views/SingleMatch.fxml");
    }

    @FXML
    public void goToDoubleMatch(){
        goToMatch("双人赛","../views/DoubleMatch.fxml");
    }

    @FXML
    public void goToTripleMatch(){
        goToMatch("三人赛","../views/TripleMatch.fxml");
    }

    @FXML
    public void goToPentaMatch(){
        goToMatch("五人赛","../views/PentaMatch.fxml");
    }
    @FXML
    public void goToClassicMatch() {
        if (canBeginClassicMatch())
            goToMatch("精英赛", "../views/ClassicMatch.fxml");
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("请先进行其他比赛");

            alert.showAndWait();

        }
    }
    @FXML
    public void goToFinalMatch()
    {
        if (canBeginClassicMatch())
            goToMatch("总决赛", "../views/FinalMatch.fxml");
        else
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("请先进行精英赛");
            alert.showAndWait();

        }
    }

    public boolean canBeginFinalMatch()
    {
        try
        {
            Field[] fields1 = ClassicMatchController.class.getDeclaredFields();
            fields1[0].setAccessible(true);
            if((int) fields1[0].get("ClassicMatchController") > 0)
                return true;
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean canBeginClassicMatch()
    {
        try
        {
            Field[] fields1 = SingleMatchController.class.getDeclaredFields();
            Field[] fields2 = DoubleMatchController.class.getDeclaredFields();
            Field[] fields3 = TripleMatchController.class.getDeclaredFields();
            Field[] fields4 = PentaMatchController.class.getDeclaredFields();
            fields1[0].setAccessible(true);
            fields2[0].setAccessible(true);
            fields3[0].setAccessible(true);
            fields4[0].setAccessible(true);
            if ((int) fields1[0].get("SingleMatchController") > 0 && (int) fields2[0].get("DoubleMatchController") > 0
                    && (int) fields3[0].get("TripleMatchController") > 0 && (int) fields3[0].get("PentaMatchController") > 0
            )
                return true;
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }

        return false;
    }


    public String findScore(){

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, a Text Input Dialog");
        dialog.setContentText("Please enter your name:");
        Optional<String> result = dialog.showAndWait();
        String a=result.get();
        PlayerDAOImpl playerDAO=new PlayerDAOImpl();
        Player  player= playerDAO.getOnePlayerByName(a);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(player.toString());
        alert.showAndWait();
        return result.get();

    }


}

