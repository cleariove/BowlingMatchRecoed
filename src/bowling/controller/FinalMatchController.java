package bowling.controller;

import bowling.dao.InningRecordDAO;
import bowling.dao.InningRecordDAOImpl;
import bowling.dao.PlayerDAO;
import bowling.dao.PlayerDAOImpl;
import bowling.logic.AllPlayers;
import bowling.logic.FinalMatch;
import bowling.logic.InningRecord;
import bowling.logic.RoundRecords;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class FinalMatchController implements Initializable
{
    private InningRecordDAO DAO;

    private PlayerDAO playerDAO;

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

    private static int i=0;

    ObservableList<InningRecord> list = FXCollections.observableArrayList();


    public void beginFinalMatch()
    {
        DAO = new InningRecordDAOImpl();
        playerDAO = new PlayerDAOImpl();
        AllPlayers finalPlayers = new AllPlayers();
        finalPlayers.add(playerDAO.getPlayerByClassicMatchRank(4).get(3));
        finalPlayers.add(playerDAO.getPlayerByClassicMatchRank(4).get(2));
        finalMatch(finalPlayers,"四强赛");
        finalPlayers.clear();
        finalPlayers.add(playerDAO.getPlayerByClassicMatchRank(4).get(1));
        finalPlayers.add(playerDAO.getPlayerByTopFourMatchRank(1).get(0));
        finalMatch(finalPlayers,"三强赛");
        finalPlayers.clear();
        finalPlayers.add(playerDAO.getPlayerByClassicMatchRank(4).get(0));
        finalPlayers.add(playerDAO.getPlayerByTopThreeMatchRank(1).get(0));
        finalMatch(finalPlayers,"总决赛");
    }

    public void finalMatch(AllPlayers finalPlayers,String event)
    {
        RoundRecords[][] roundRecords = new RoundRecords[2][10];
        FinalMatch finalMatch = new FinalMatch(finalPlayers,roundRecords,event);
        finalMatch.matchBegin();
        new Pratical().insertRecord(2,2,roundRecords);
        updatePlayerScore(2,finalPlayers,event);
    }

    public void updatePlayerScore(int i,AllPlayers allPlayers,String event)
    {
        for(int k = 0;k < i;k++)
        {
            playerDAO.updateScore(allPlayers.get(k).getName(), allPlayers.get(k).getScore());
            switch(event)
            {
                case "四强赛":
                    playerDAO.updateTopFourScore(allPlayers.get(k).getName(), allPlayers.get(k).getTopFourScore());
                    break;
                case "三强赛":
                    playerDAO.updateTopThreeScore(allPlayers.get(k).getName(), allPlayers.get(k).getTopThreeScore());
                    break;
                case "总决赛":
                    playerDAO.updateFinalScore(allPlayers.get(k).getName(), allPlayers.get(k).getFinalScore());
                    break;
            }
        }
    }


    public void nextInning(int inning,String event)
    {
        roundText.setText(String.valueOf(inning));
        list.clear();
        Table.refresh();
        DAO =new InningRecordDAOImpl();
        list.addAll( DAO.getMatchScoreByInning(inning,event));
        setColumn();
        Table.refresh();
    }

    public void roundOne(){
        nextInning(1,"四强赛");
    }

    public void roundTwo(){
        nextInning(2,"四强赛");
    }
    public void roundThree(){
        nextInning(1,"三强赛");
    }
    public void roundFour(){
        nextInning(2,"三强赛");
    }
    public void roundFive(){
        nextInning(1,"总决赛");
    }
    public void roundSix(){
        nextInning(2,"总决赛");
    }

    public void setColumn(){

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

    public void doubleGameTable() {
        if(i==0){
            beginFinalMatch();
            i++;
            System.out.println(i);
        }
        Table.getStyleClass().add("table-view");
        DAO =new InningRecordDAOImpl();
        list.clear();
        list = FXCollections.observableArrayList(DAO.getMatchScoreByInning(1,"总决赛"));

        setColumn();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        doubleGameTable();
    }

}
