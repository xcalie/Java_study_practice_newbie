package JDBC;

import JDBC.JDBCUtils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public static void main(String[] args) {
        JDBCDemo1 demo = new JDBCDemo1();
        demo.JDBCSelectAll(); // 调用方法
        //demo.JDBCInsert("李四", 20);
        //demo.JDBCUpdate(1, "王五", 30);
        //demo.JDBCDelete(1);
    }

    public void JDBCInsert(String name, int age) {
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = String.format("INSERT INTO student (name, age) VALUES ('%s', %d)", name, age);
            statement.executeUpdate(sql);// 执行SQL语句 插入 使用insert
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, statement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void JDBCUpdate(int id, String name, int age){
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = String.format("UPDATE student SET name = '%s', age = %d WHERE id = %d", name, age, id);
            statement.executeUpdate(sql);// 执行SQL语句 更新 使用update
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, statement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void JDBCDelete(int id) {
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = String.format("DELETE FROM student WHERE id = %d", id);
            statement.executeUpdate(sql);// 执行SQL语句 删除 使用delete
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, statement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void JDBCSelectAll() {
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM student");// 执行SQL语句 查询 使用select

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
                JDBCUtils.close(connection, statement, resultSet);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
