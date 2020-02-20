package bowling.controller;

import bowling.dao.InningRecordDAO;
import bowling.dao.InningRecordDAOImpl;
import bowling.dao.PlayerDAO;
import bowling.dao.PlayerDAOImpl;
import bowling.logic.AllPlayers;
import bowling.logic.ClassicMatch;
import bowling.logic.InningRecord;
import bowling.logic.RoundRecords;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassicMatchController implements Initializable
{
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
    @FXML
    private SplitMenuButton SMB;
    @FXML
    private MenuItem item1;
    @FXML
    private MenuItem item2;
    @FXML
    private MenuItem item3;
    @FXML
    private MenuItem item4;
    @FXML
    private MenuItem item5;
    @FXML
    private MenuItem item6;
    @FXML
    private MenuItem item7;
    @FXML
    private MenuItem item8;
    @FXML
    private MenuItem item9;
    @FXML
    private MenuItem item10;
    @FXML
    private MenuItem item11;
    @FXML
    private MenuItem item12;
    @FXML
    private MenuItem item13;
    @FXML
    private MenuItem item14;
    @FXML
    private MenuItem item15;

    private InningRecordDAO DAO;
    private PlayerDAO playerDAO;
    ObservableList<InningRecord> list = FXCollections.observableArrayList();
    @FXML
    public void show()
    {
        switch (SMB.getText())
        {
            case "第一局":
                nextInning(1);
                break;
            case "第二局":
                nextInning(2);
                break;
            case "第三局":
                nextInning(3);
                break;
            case "第四局":
                nextInning(4);
                break;
            case "第五局":
                nextInning(5);
                break;
            case "第六局":
                nextInning(6);
                break;
            case "第七局":
                nextInning(7);
                break;
            case "第八局":
                nextInning(8);
                break;
            case "第九局":
                nextInning(9);
                break;
            case "第十局":
                nextInning(10);
                break;
            case "第十一局":
                nextInning(11);
                break;
            case "第十二局":
                nextInning(12);
                break;
            case "第十三局":
                nextInning(13);
                break;
            case "第十四局":
                nextInning(14);
                break;
            case "第十五局":
                nextInning(15);
                break;
        }
    }

    @FXML
    public void deal1()
    {
        SMB.setText(item1.getText());
    }

    @FXML
    public void deal2()
    {
        SMB.setText(item2.getText());
    }
    @FXML
    public void deal3()
    {
        SMB.setText(item3.getText());
    }
    @FXML
    public void deal4()
    {
        SMB.setText(item4.getText());
    }
    @FXML
    public void deal5()
    {
        SMB.setText(item5.getText());
    }
    @FXML
    public void deal6()
    {
        SMB.setText(item6.getText());
    }
    @FXML
    public void deal7()
    {
        SMB.setText(item7.getText());
    }
    @FXML
    public void deal8()
    {
        SMB.setText(item8.getText());
    }
    @FXML
    public void deal9()
    {
        SMB.setText(item9.getText());
    }
    @FXML
    public void deal10()
    {
        SMB.setText(item10.getText());
    }
    @FXML
    public void deal11()
    {
        SMB.setText(item11.getText());
    }
    @FXML
    public void deal12()
    {
        SMB.setText(item12.getText());
    }
    @FXML
    public void deal13()
    {
        SMB.setText(item13.getText());
    }
    @FXML
    public void deal14()
    {
        SMB.setText(item14.getText());
    }
    @FXML
    public void deal15()
    {
        SMB.setText(item15.getText());
    }

    public void beginClassicMatch()
    {
        DAO = new InningRecordDAOImpl();
        playerDAO = new PlayerDAOImpl();
        AllPlayers classicPlayers = new AllPlayers();
        classicPlayers.addAll(playerDAO.getPlayerByTotalRank(16));
        RoundRecords[][] classicRecords = new RoundRecords[15][10];
        ClassicMatch classicMatch = new ClassicMatch(classicPlayers,classicRecords);
        classicMatch.matchBegin();
        new Pratical().insertRecord(15,16,classicRecords);
        //insertRecordToDB(15,16,classicRecords);
        updatePlayerScore(16,classicPlayers);
    }

    public void updatePlayerScore(int i,AllPlayers allPlayers)
    {
        for(int k = 0;k < i;k++)
        {
            playerDAO.updateScore(allPlayers.get(k).getName(), allPlayers.get(k).getScore());
            playerDAO.updateClassicScore(allPlayers.get(k).getName(),allPlayers.get(k).getClassicScore());
        }
    }


    public void nextInning(int inning)
    {
        roundText.setText(String.valueOf(inning));
        list.clear();
        Table.refresh();
        DAO =new InningRecordDAOImpl();
        list.addAll(DAO.getMatchScoreByInning(inning,"精英赛"));
        setColumn();
        Table.refresh();
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

    public void classicGameTable() {
        if(i==0){
            beginClassicMatch();
            i++;
            System.out.println(i);
        }
        Table.getStyleClass().add("table-view");
        DAO =new InningRecordDAOImpl();
        list.clear();
        list = FXCollections.observableArrayList(DAO.getMatchScoreByInning(1,"精英赛"));
        setColumn();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

       classicGameTable();
    }

}


