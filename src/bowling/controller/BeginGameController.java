package bowling.controller;

import bowling.dao.PlayerDAO;
import bowling.dao.PlayerDAOImpl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BeginGameController
{
    @FXML
    AnchorPane pane;

    private PlayerDAO DAO;

    @FXML
    public void importPlayerData()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("选择队员信息存储路径");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("文本文档","*.txt"));
        File file= fileChooser.showSaveDialog(pane.getScene().getWindow());
        try(PrintWriter printWriter = new PrintWriter(file))
        {
            printWriter.print("zhangsan m\r\n" +
                    "lisi f\r\n" +
                    "wangwu m\r\n" +
                    "zhaoliu f\r\n" +
                    "qianqi m\r\n" +
                    "sunba f\r\n" +
                    "yangjiu m\r\n" +
                    "wushi f\r\n" +
                    "xiaoming m\r\n" +
                    "xiaohong f\r\n" +
                    "xiaohei m\r\n" +
                    "xiaobai f\r\n" +
                    "dahuang m\r\n" +
                    "erha f\r\n" +
                    "lihua m \r\n" +
                    "xiaofang f\r\n" +
                    "xiaoqiang m\r\n" +
                    "apple f\r\n" +
                    "banana m\r\n" +
                    "watermelon f\r\n" +
                    "peach m\r\n" +
                    "lemon f\r\n" +
                    "pear m\r\n" +
                    "grape f\r\n" +
                    "tomato m \r\n" +
                    "strawberry f\r\n" +
                    "orange m\r\n" +
                    "cherry f\r\n" +
                    "blueberry m\r\n" +
                    "peanut f\r\n" +
                    "pomelo m\r\n" +
                    "mango f\r\n" +
                    "blue m\r\n" +
                    "red f\r\n" +
                    "black m\r\n" +
                    "white f\r\n" +
                    "brown m\r\n" +
                    "yellow f\r\n" +
                    "pink m\r\n" +
                    "green f\r\n" +
                    "gray m\r\n" +
                    "gold f\r\n" +
                    "purple m\r\n" +
                    "lion f\r\n" +
                    "tiger m\r\n" +
                    "pig f\r\n" +
                    "cow m\r\n" +
                    "wolf f\r\n" +
                    "cat m \r\n" +
                    "rabbit f\r\n" +
                    "dog m\r\n" +
                    "monkey f\r\n" +
                    "fish m\r\n" +
                    "duck f\r\n" +
                    "horse m\r\n" +
                    "bird f\r\n" +
                    "mouse m\r\n" +
                    "sheep f\r\n" +
                    "deer m\r\n" +
                    "panda f");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        insertToDB(file);
        goToMatch();
    }

    public void insertToDB(File file)
    {
        DAO = new PlayerDAOImpl();
        try(Scanner sc = new Scanner(file))
        {
            Integer i = 1;
            while(sc.hasNext())
            {
                DAO.insertPlayer(sc.next(),String.valueOf(i),sc.next());
                i++;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void goToMatch(){
        try {
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("../views/MainView.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("比赛类型");
            anotherStage.setScene(new Scene(anotherRoot, 730, 980));
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
