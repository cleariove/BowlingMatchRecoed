package bowling.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/bowling?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=GMT%2B8";
    private static final String user = "root";
    private static final String passWord = "123456";
    static
    {
        try
        {
            Class.forName(driver);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("数据库驱动没有安装");
            e.printStackTrace();
        }
    }

    protected Connection getConnection()
    {
        try
        {
            return DriverManager.getConnection(url, user, passWord);
        }
        catch (SQLException e)
        {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
        return null;
    }

}