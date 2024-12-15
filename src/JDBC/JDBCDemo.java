package JDBC;

import org.junit.Test;

import java.sql.*;

public class JDBCDemo {

    private static final String URL = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; // 更新驱动类

    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;

    public static void main(String[] args){
        //SelectAll();

    }

    public static void SelectAll(){
        try {
            // 新版本由于驱动类会自动注册，可以移除这行代码
            // Class.forName(DRIVER);

            // 获取数据库连接
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // 获取Statement操作对象
            statement = connection.createStatement();

            // 执行SQL语句
            resultSet = statement.executeQuery("SELECT * FROM student");

            // 处理结果
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println(id + " " + name + " " + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
