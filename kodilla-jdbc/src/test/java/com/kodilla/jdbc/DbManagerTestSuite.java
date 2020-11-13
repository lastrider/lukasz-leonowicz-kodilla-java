package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        rs.afterLast();

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery ="SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POST_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON P.USER_ID = U.ID\n" +
                "GROUP BY USER_ID\n" +
                "HAVING COUNT(*) >=2;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        List<String> listOfUsers =new ArrayList<>();
        while (resultSet.next()) {
            String user = resultSet.getString("FIRSTNAME") + " " + resultSet.getString("LASTNAME");
            listOfUsers.add(user);
            System.out.println(user);
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(1, listOfUsers.size());
        Assert.assertTrue(listOfUsers.add("Zachary Lee"));
    }
}