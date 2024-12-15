package JDBC;

import JDBC.JDBCUtils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCDemo2 {

    private Connection connection;
    PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public static void main(String[] args) {
        String name;
        int age;
        System.out.println("请输入姓名和年龄：");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();

        JDBCDemo1 demo = new JDBCDemo1();
        //demo.JDBCInsert("李四", 20);
        demo.JDBCInsert(name, age);
        //demo.JDBCUpdate(1, "王五", 30);
        //demo.JDBCDelete(1);
        demo.JDBCSelectAll(); // 调用方法
    }

    public void JDBCInsert(String name, int age) {
        try {
            connection = JDBCUtils.getConnection();

            String sql = "INSERT INTO student (name, age) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void JDBCUpdate(int id, String name, int age){
        try {
            connection = JDBCUtils.getConnection();
            String sql = "UPDATE student SET name = ?, age = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, id);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void JDBCDelete(int id) {
        try {
            connection = JDBCUtils.getConnection();

            String sql = "DELETE FROM student WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void JDBCSelectAll() {
        try {
            connection = JDBCUtils.getConnection();

            String sql = "SELECT * FROM student";
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            int id = 0;
            String name = null;
            int age = 0;
            while (resultSet.next()) {
                id = resultSet.getInt(1);
                name = resultSet.getString(2);
                age = resultSet.getInt(3);
                System.out.println(id + " " + name + " " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement, resultSet);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
