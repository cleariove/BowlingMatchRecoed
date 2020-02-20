package bowling.controller;


import bowling.dao.PlayerDAO;
import bowling.dao.PlayerDAOImpl;
import bowling.dao.InningRecordDAO;
import bowling.dao.InningRecordDAOImpl;
import bowling.logic.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SingleMatchController implements Initializable {

    private static int i=0;
    @FXML
    TableColumn name;
    @FXML
    TableView<InningRecord> Table;
    @FXML
    private TableColumn ID;
    @FXML
    private TableColumn one_1;
    @FXML
    private TableColumn one_2;
    @FXML
    private TableColumn two_1;
    @FXML
    private TableColumn two_2;
    @FXML
    private TableColumn three_1;
    @FXML
    private TableColumn three_2;
    @FXML
    private TableColumn four_1;
    @FXML
    private TableColumn four_2;
    @FXML
    private TableColumn five_1;
    @FXML
    private TableColumn five_2;
    @FXML
    private TableColumn six_1;
    @FXML
    private TableColumn six_2;
    @FXML
    private TableColumn seven_1;
    @FXML
    private TableColumn seven_2;
    @FXML
    private TableColumn eight_1;
    @FXML
    private TableColumn eight_2;
    @FXML
    private TableColumn nine_1;
    @FXML
    private TableColumn nine_2;
    @FXML
    private TableColumn ten_1;
    @FXML
    private TableColumn ten_2;
    @FXML
    private TableColumn ten_3;
    @FXML
    private TableColumn finalScore;
    @FXML
    private TextField roundText;

    private InningRecordDAO DAO;

    private PlayerDAO playerDAO;

    ObservableList<InningRecord> list = FXCollections.observableArrayList();

    public void beginSingleGame() {

        DAO = new InningRecordDAOImpl();
        playerDAO = new PlayerDAOImpl();
        AllPlayers allPlayers = new AllPlayers();
        allPlayers.addAll(playerDAO.getAllPlayer());
        RoundRecords[][] singleRecords = new RoundRecords[6][10];
        SingleMatch singleMatch = new SingleMatch(allPlayers, singleRecords);
        singleMatch.matchBegin();
        new Pratical().insertRecord(6,60,singleRecords);
        updatePlayerScore(60,allPlayers);
    }

    public void updatePlayerScore(int i,AllPlayers allPlayers)
    {
        for(int k = 0;k < i;k++)
        {
            playerDAO.updateScore(allPlayers.get(k).getName(), allPlayers.get(k).getScore());
            playerDAO.updateSingleScore(allPlayers.get(k).getName(),allPlayers.get(k).getSingleScore());
        }
    }


    public void nextInning(int inning)
    {
        roundText.setText(String.valueOf(inning));
        list.clear();
        Table.refresh();
        DAO = new InningRecordDAOImpl();
        list.addAll(DAO.getMatchScoreByInning(inning,"单人赛"));
        setColumn();
        Table.refresh();
    }

    public void roundOne(){
        nextInning(1);
    }
    public void roundTwo(){
        nextInning(2);
    }
    public void roundThree(){
        nextInning(3);
    }
    public void roundFour(){
        nextInning(4);
    }
    public void roundFive(){
        nextInning(5);
    }
    public void roundSix(){
        nextInning(6);
    }

    public void setColumn()
    {
        name.setCellValueFactory(new PropertyValueFactory<InningRecord,String>("name"));
        ID.setCellValueFactory(new PropertyValueFactory<>("teamNum"));
        one_1.setCellValueFactory(new PropertyValueFactory<>("firstScore1"));
        one_2.setCellValueFactory(new PropertyValueFactory<>("secondScore1"));
        two_1.setCellValueFactory(new PropertyValueFactory<>("firstScore2"));
        two_2.setCellValueFactory(new PropertyValueFactory<>("secondScore2"));
        three_1.setCellValueFactory(new PropertyValueFactory<>("firstScore3"));
        three_2.setCellValueFactory(new PropertyValueFactory<>("secondScore3"));
        four_1.setCellValueFactory(new PropertyValueFactory<>("firstScore4"));
        four_2.setCellValueFactory(new PropertyValueFactory<>("secondScore4"));
        five_1.setCellValueFactory(new PropertyValueFactory<>("firstScore5"));
        five_2.setCellValueFactory(new PropertyValueFactory<>("secondScore5"));
        six_1.setCellValueFactory(new PropertyValueFactory<>("firstScore6"));
        six_2.setCellValueFactory(new PropertyValueFactory<>("secondScore6"));
        seven_1.setCellValueFactory(new PropertyValueFactory<>("firstScore7"));
        seven_2.setCellValueFactory(new PropertyValueFactory<>("secondScore7"));
        eight_1.setCellValueFactory(new PropertyValueFactory<>("firstScore8"));
        eight_2.setCellValueFactory(new PropertyValueFactory<>("secondScore8"));
        nine_1.setCellValueFactory(new PropertyValueFactory<>("firstScore9"));
        nine_2.setCellValueFactory(new PropertyValueFactory<>("secondScore9"));
        ten_1.setCellValueFactory(new PropertyValueFactory<>("firstScore10"));
        ten_2.setCellValueFactory(new PropertyValueFactory<>("secondScore10"));
        ten_3.setCellValueFactory(new PropertyValueFactory<>("thirdScore"));
        finalScore.setCellValueFactory(new PropertyValueFactory<>("teamInningScore"));
        Table.setItems(list);

    }

    public void singleGameTable() {
        if(i==0){
            beginSingleGame();
            i++;
            System.out.println(i);
        }
        Table.getStyleClass().add("table-view");
        roundText.getStyleClass().add(".text-field");
        DAO =new InningRecordDAOImpl();
        list.clear();
        list = FXCollections.observableArrayList(DAO.getMatchScoreByInning(1,"单人赛"));
        setColumn();
    }

    public void getTopThreeTeam(AllPlayers topThreePlayers)
    {
        playerDAO = new PlayerDAOImpl();
        topThreePlayers.addAll(playerDAO.getPlayerBySingleMatchRank(3));
    }

    @FXML
    public void goToTopThree()
    {


        try {
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("../views/TopThree.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("颁奖仪式");
            anotherStage.setScene(new Scene(anotherRoot, 1000, 800));
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }



    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        singleGameTable();
    }

}
