package bowling.controller;

import bowling.dao.InningRecordDAOImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class testController implements Initializable{

    @FXML
    private TextField one_1;
    @FXML
    private TextField one_2;
    @FXML
    private TextField one;
    @FXML
    private AnchorPane _1;

    public void setScore() {


//            try {
//
//                //2.加载驱动程序
//
//                Connection conn;
//
//                //3.创建连接
//
//                conn = DriverManager.getConnection(
//
//                        "jdbc:mysql://localhost:3306/bowling?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=GMT%2B8",
//
//                        "root", "hzj123456");
//
//////
////            4.创建执行语句
//                String sql = "select firstScore1,secondScore1,personRoundScore1 from inningrecord where teamNum=1 and inning=1";
//                PreparedStatement stmt = conn.prepareStatement(sql);
//                ResultSet rs = stmt.executeQuery(sql);
//
//                //6.处理结果集
//
//                while (rs.next()) {
//
//                    one_1.setText(String.valueOf(rs.getInt("firstScore1")) );
//                    System.out.println(rs.getInt("firstScore1"));
//                    one_2.setText(String.valueOf(rs.getInt("secondScore1")) );
//                    one.setText(String.valueOf(rs.getInt("personRoundScore1")));
//
//                }
//
//
//            }
//            catch (SQLException e)
//            {
//                e.printStackTrace();
//
//            }

//        InningRecordDAOImpl DAO = new InningRecordDAOImpl();
//        int[] s=new int[3];
//
//        DAO.score(s,"firstScore1","secondScore1","personRoundScore1",   1,3);

         //one.setText(s[2]);

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setScore();
    }
}

