package JDBC.JDBCUtils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    //新版本中已经弃用driver
    //private static String driver;
    private static String url;
    private static String user;
    private static String password;

    //静态代码块
    static{
        try {
            //获取配置文件信息
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("db.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");

            System.out.println(url + "\n" + user + "\n" + password);
            init();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void init(){
        System.out.println("已启用");
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public static void close(Connection connection, Statement statement) throws SQLException{
        if(statement != null){
            statement.close();
            statement = null;
        }
        if(connection != null){
            connection.close();
            connection = null;
        }
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException{
        if(resultSet != null){
            resultSet.close();
            resultSet = null;
        }
        if(statement != null){
            statement.close();
            statement = null;
        }
        if(connection != null){
            connection.close();
            connection = null;
        }
    }


}
